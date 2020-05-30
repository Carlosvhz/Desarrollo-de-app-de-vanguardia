package examenvanguardia;


public class ExamenVanguardia {
    
    
    public static void main(String[] args) {
        
        // Singleton
        /*Singleton singleton = Singleton.getInstance("C:\\Users\\carlo\\Desktop\\texto.txt");
        singleton.writeFile("Holliwis");*/
        
        // Factory
        /*TableFactory factory = new TableFactory();
        Factory table1 = factory.createTable("MySQL");
        table1.doSomething();
        table1 = factory.createTable("Oracle");
        table1.doSomething();*/
        
        UserSubject subject = new UserSubject();
        
        UserObserver user1 = new UserObserver(subject, "Mike");
        UserObserver user2 = new UserObserver(subject, "Elise");
        UserObserver user3 = new UserObserver(subject, "Poncho");
        UserObserver user4 = new UserObserver(subject, "Fredo");
        
        user1.suggest(10);
        user2.suggest(11);
        user3.suggest(156);
        user4.suggest(10000);
    }
}
