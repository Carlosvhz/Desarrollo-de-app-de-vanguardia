package examenvanguardia;


public class ExamenVanguardia {
    
    
    public static void main(String[] args) {
        
        Singleton singleton = Singleton.getInstance("C:\\Users\\carlo\\Desktop\\texto.txt");
        singleton.writeFile("Holliwis");
        
    }
}
