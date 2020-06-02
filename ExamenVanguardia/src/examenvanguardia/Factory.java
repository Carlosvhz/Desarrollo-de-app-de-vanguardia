package examenvanguardia;

public abstract class Factory{    
   abstract void sendMessage();
}

class customSupport extends Factory{
    public void sendMessage(){
        System.out.println("Ha marcado asistencia especialziada");
    }
}

class technicalSupport extends Factory{
    public void sendMessage(){
        System.out.println("Ha marcado asistencia técnico");
    }
}

class promo extends Factory{
    public void sendMessage(){
        System.out.println("Ha marcado promociones");
    }
}

class messageFactory {
    
    public Factory createMessage(String number){
        System.out.println("Se ha ingresado el número: "+number);
        if(number.equalsIgnoreCase("1")){
            return new customSupport();
        }else if (number.equalsIgnoreCase("2")){
            return new technicalSupport();
        }else if (number.equalsIgnoreCase("3")){
            return new promo();
        }
        System.out.println("Ha salido del asistente");
        return null;
    }
    
}