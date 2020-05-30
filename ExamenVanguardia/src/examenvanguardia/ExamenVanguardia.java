package examenvanguardia;


public class ExamenVanguardia {
    
    
    public static void main(String[] args) {
        
        // Singleton
        /*Singleton singleton = Singleton.getInstance("C:\\Users\\carlo\\Desktop\\texto.txt");
        singleton.writeFile("Holliwis");*/
        
        // Factory
        TableFactory factory = new TableFactory();
        Factory table1 = factory.createTable("MySQL");
        table1.doSomething();
        table1 = factory.createTable("Oracle");
        table1.doSomething();
    }
}
