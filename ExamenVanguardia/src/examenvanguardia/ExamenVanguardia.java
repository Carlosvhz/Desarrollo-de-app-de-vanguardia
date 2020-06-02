package examenvanguardia;


public class ExamenVanguardia {
    
    
    public static void main(String[] args) {
        
        // Singleton
        /*PC pc1 = new PC(1);
        PC pc2 = new PC(2);
        PC pc3 = new PC(3);
        
        pc1.signIn("ReseT@rude.com", "1234"); // 
        pc2.signIn("ReseT@rude.com", "1234");
        pc3.signIn("ReseT@rude.com", "1234");
        pc1.signOut();
        pc3.signIn("ReseT@rude.com", "1234");*/
        
        
        // Factory
        /*messageFactory factory = new messageFactory();
        System.out.println("Ingrese 1 para asistencia especialziada \n"
                + "Ingrese 2 para asistencia técnica \n"
                + "Ingrese 3 para saber nuestras promociones");
        Factory message = factory.createMessage("3");
        message.sendMessage();*/
        
        
        //Observer
        /*UserSubject subject = new UserSubject();
        UserObserver user1 = new UserObserver(subject, "Mike");
        UserObserver user2 = new UserObserver(subject, "Elise");
        UserObserver user3 = new UserObserver(subject, "Poncho");
        UserObserver user4 = new UserObserver(subject, "Fredo");
        
        user1.suggest(10);
        user2.suggest(11);
        user3.suggest(156);
        user4.suggest(10000);*/
        
        //Builder
        /*ErrorBuilder builder = new ErrorBuilder(10, 12000);
        Error error = builder.withKeyWord("Probable error en línea 54")
                .withDuration(120000)
                .withTimeStamp()
                .buildError(); //Adapter
        */
        
        // Adapter
        /*int number = 3;
        System.out.println("Ingrese el método de pago: \n"
                + "1. Efectivo \n"
                + "2. Crédito \n"
                + "3. Ingrese un cupón: ");
        System.out.println("Ingreso número "+number);
        switch(number){
            case 1:{
                cashMethod cash = new cashMethod(10000);
                cash.pay(200000);
            }
            case 2:{
                creditMethod credit = new creditMethod("5412753856789010", "CardHolder", 227, "12/20");
                credit.pay(10000);
            }
            case 3:{
                adapterPaidMethod coupon = new adapterPaidMethod("420CC15");
                coupon.pay(10000);
            }
            
        }*/
        
        //State
        /*deliveryState ds = new deliveryState(null, "2");
        
        ds.updatePackage();
        ds.updatePackage();
        ds.updatePackage();*/
    }
}
