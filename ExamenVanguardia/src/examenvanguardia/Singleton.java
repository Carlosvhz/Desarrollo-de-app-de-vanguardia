package examenvanguardia;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
/*
Ejemplo singleton donde un objeto singleton contiene los métodos necesarios para escribir y modificar un archivo dado
*/

public class Singleton {
    
    private BufferedReader br = null;
    private BufferedWriter bw = null;
    private FileReader reader = null;
    private FileWriter writer = null;
    private File file = null;
    private String url;
    private static Singleton instancia;
    
    
    public static Singleton getInstance(String url){
        if(instancia == null){
            instancia = new Singleton(url);
        }
        return instancia;
    }
    
    private Singleton(String url){
        this.url = url;
    }
    
    public void setURL(String url){
        this.url = url;
    }

    //WriteFile
    public void writeFile(String url, String texto){
        this.url = url;
        writeFile(texto);
    }
    
    public void writeFile(String texto){
        try {
            file = new File(url);
            writer = new FileWriter(file);
            writer.write(texto);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if (file ==null)
                    writer.close();
                System.out.println("No existe el archivo");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Hubo un error");
            }
        }
    }
    
    // ReadFile
    public void readFile(String url){
        this.url = url;
        readFile();
    }  
    
    public void readFile(){
        try {
            file = new File(url);
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String line;
            while( (line=br.readLine())!=null )
                System.out.println(line);
        } catch (Exception e) {
        }finally{
            try {
                if (reader==null)
                    reader.close();
                System.out.println("No existe el archivo");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Hubo un error");
            }
        }
    }
}
