package examenvanguardia;

public abstract class Adapter {
    
    abstract float pay(float money);
}

class Wallet{
    private double mount;
    
    Wallet(double mount){
        this.mount = mount;
    }
    
    double getMount(){
        return mount;
    }
    
    double getMoney(double money){
        if(money>mount){
            System.out.println("No tiene suficientes fondos en la billetera");
            return 0;
        }
        mount-=money;
        return money;
    }
}

class cashMethod extends Adapter{
   
    private Wallet wallet;
    
    public cashMethod(double wallet){
        this.wallet = new Wallet(wallet);
    }
    
    float pay(float money) {
        if(wallet.getMoney(money)==0){
            System.out.println("No hay suficiente dinero en la billetera");
        }
        System.out.println("Se ha pagado exitosamentev");
        return money ;
    }

   
}

class creditMethod extends Adapter{
    
    private String number;
    private String name;
    private int ccv;
    private String expDate;
    
    public creditMethod(String number, String name, int ccv, String expDate){
        this.number = number;
        this.name = name;
        this.ccv = ccv;
        this.expDate = expDate;
    }
    
    float pay(float money) {
        System.out.println("Se ha debitado "+money+"L en su cuenta bancaria");
        return money;
    }  
}

 class adapterPaidMethod extends Adapter{

    private couponMethod coupon;
    
    adapterPaidMethod(String couponNumber){
        coupon = new couponMethod(couponNumber);
    }
    
    float pay(float money) {
        if (coupon.exChange()<money){
            System.out.println("El dinero del cupón no es suficiente");
            return 0;
        }
        System.out.println("Se ha canjeado y pagado exitosamente");
        return coupon.exChange();
    }
     
 }

class couponMethod{
    
    private String couponNumber;
    private float value;
    
    couponMethod(String couponNumber){
        this.couponNumber = couponNumber;
        value = ((float) Math.random() * (90+1))+10;
    }
    
    float exChange(){
        return value;
    }
}