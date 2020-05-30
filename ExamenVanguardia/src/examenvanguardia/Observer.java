package examenvanguardia;

import java.util.ArrayList;

/**
 * Se toma coomo caso el uso de este patron de diseño en un sistema de ventas como Ebay
 */
public abstract class Observer {   
    protected UserSubject user;
    public abstract void update();
}

class UserSubject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private int amount;
    
    public int getAmount(){
        return amount;
    }
    
    public void setAmount(int amount){
        System.out.println("El nuevo monto total es: "+ amount+ " lempiras");
        this.amount = amount;
    }
    
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    
    public void notifyAllObservers(){
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
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
