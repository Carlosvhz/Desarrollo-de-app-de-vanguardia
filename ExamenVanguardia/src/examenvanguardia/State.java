package examenvanguardia;

public abstract class State {
    public abstract void updatePackage(deliveryState state );
}

//Contexto
class deliveryState{
    
    private State state;
    private String packageId;
    
    public deliveryState(State state, String packageId){
        this.state = state;
        this.packageId = packageId;
        if(state==null){
            this.state = new inProcess();
        }
    }
    
    public State getState(){
        return state;
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public String getPackageId(){
        return packageId;
    }

    
    public void updatePackage(){
        state.updatePackage(this);
    }
}

class inProcess extends State{
    
    public inProcess(){
        System.out.println("nuevo paquete agregado");
    }
    
    @Override
    public void updatePackage(deliveryState state) {
        System.out.println("El paquete está en proceso");
        state.setState(new onTheWay());
    }
    
}

class onTheWay extends State{
    
    public onTheWay(){}
    
    @Override
    public void updatePackage(deliveryState state){
        System.out.println("El paquete está en camino");
        state.setState(new delivered());
    }
}

class delivered extends State{
   
    public delivered(){}
    
    @Override
    public void updatePackage(deliveryState state) {
        System.out.println("El paquete ha sido entregado");
    }
    
}
