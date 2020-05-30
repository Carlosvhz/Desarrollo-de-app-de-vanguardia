package examenvanguardia;

/*
Se propone un caso en el que el proyecto este usando diversas bases de datos,
para poder convertir o cambiar la base de datos se implementará el patrón de diseño
factory.
*/

public abstract class Factory{    
   abstract void doSomething();
}

class mySqlTable extends Factory{
    public void doSomething(){
        System.out.println("Making a new sql table");
    }
}

 class OracleTable extends Factory{
    public void doSomething(){
        System.out.println("Making a new Oracle table");
    }
}

class TableFactory {
    
    public Factory createTable(String dbType){
        if(dbType.equalsIgnoreCase("mysql")){
            return new mySqlTable();
        }else if (dbType.equalsIgnoreCase("oracle")){
            return new OracleTable();
        }
        return null;
    }
    
}