package examenvanguardia;

public class Singleton {
    
    private String correoElectronico;
    private String password;
    private static Singleton instancia;
    
    
    private Singleton(String correoElectronico, String password){
        this.correoElectronico = correoElectronico;
        this.password = password;
    }
    
    public static Singleton getInstance(String correoElectronico, String password){
        if(instancia == null){
            System.out.println("Sesión creada con éxito");
            instancia = new Singleton(correoElectronico, password);
        }else{
            System.out.println("Este usuario ya tiene sesión abierta");
        }
        return instancia;
    }
    
    public void deleteInstance(){
        instancia = null;
    }
    
    public String getCorreoElectronico(){
        return this.correoElectronico;
    }
    
}

class PC {
    
    private Singleton singleton;
    private int pcId;
    
    public PC(int pcId){
        System.out.println("Se ha encendido el PC "+pcId);
        this.pcId = pcId;
    }
    
    public void signIn(String correo, String password){
        singleton = Singleton.getInstance(correo, password);
    }
    
    public void signOut(){
        System.out.println("Sesión de "+singleton.getCorreoElectronico()+" ha sido cerrada");
        singleton.deleteInstance();
        singleton = null;
        System.gc();
    }
    
}
