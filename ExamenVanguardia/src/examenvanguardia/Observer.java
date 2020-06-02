package examenvanguardia;

public abstract class Observer {   
    protected UserSubject user;
    public abstract void update();
}

class UserSubject {
    private Observer observers[] = new Observer[0];
    private int amount;
    
    //
    private Observer[] add(Observer element){
        if(observers.length==0){
            Observer newList[] = new Observer[1];
            newList[0] = element;
            return newList;
        }
        int index = observers.length+1;
        Observer newList[] = new Observer[index];
        for(int i=0; i<observers.length; i++){
            newList[i] = observers[i];
        }
        System.out.println(newList.length);
        return newList;
    }
    //
    public int getAmount(){
        return amount;
    }
    
    public void setAmount(int amount){
        System.out.println("El nuevo total es: "+ amount+ " lempiras");
        this.amount = amount;
    }
    
    public void registerObserver(Observer observer){
        observers = add(observer);
    }
    
    public void notifyAllObservers(){
        for (int i = 0; i < observers.length; i++) {
            observers[i].update();
        }
    }
}

class UserObserver extends Observer{
    
    private String name;
    public UserObserver(UserSubject user, String name){
        this.user = user;
        this.name = name;
        this.user.registerObserver(this);
    }
    
    public String getName(){
        return name;
    }
    
    public void suggest(int amount){
        if(amount > user.getAmount()){
            System.out.println("El usuario "+name+" ha propuesto "+amount+" lempiras");
            user.setAmount(user.getAmount()+amount);
        }else{
            System.out.println("No puedes agregar menos del dinero ya propuesto!!");
        }
    }
    
    @Override
    public void update(){
        System.out.println("nuevo monto es: "+user.getAmount());
    }
}
