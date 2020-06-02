package examenvanguardia;

import java.time.LocalDateTime;

public abstract class Builder {
    abstract Error buildError();
}

class Error extends Exception{
    
    private int elementId;
    private int lineCode; // Linea de código de donde empieza el try catch
    private String timeStamp; // Tiempo en el que ocurre el error
    private String keyWord; // Palabra clave como referencia, opcional
    private int duration;
    
    
    public Error(){
    }
    
    // ==> ElementID
    public int getElementId(){
        return elementId;
    }
    
    public void setElementId(int elementId){
        this.elementId = elementId;
    }
    
    // ==> lineCode
    public int getLineCode(){
        return lineCode;
    }
    
    public void setLineCode(int lineCode){
        this.lineCode = lineCode;
    }
    
    // ==> TimeStamp
    public String getTimeStamp(){
        return timeStamp;
    }
    
    public void setTimeStamp(String timeStamp){
        this.timeStamp = timeStamp;
    }
    
    // ==> key word
    public String getKeyWord(){
        return keyWord;
    }
    
    public void setKeyWord(String keyWord){
        this.keyWord = keyWord;
    }
    
    // ==> Duration
    public int getDuration(){
        return duration;
    }
    
    public void setDuration(int duration){
        this.duration = duration; //Segundos en los que ha transcurrido la compilación hasta
                                  // el momento del error
    }
    
}

class ErrorBuilder extends Builder{
    
    private int elementId;
    private int lineCode;
    private String timeStamp;
    private String keyWord;
    private int duration;
    private Exception exception = new Exception();
    
    public ErrorBuilder(int elementId, int lineCode){
        this.elementId = elementId;
        this.lineCode = lineCode;
    }
    
    public ErrorBuilder withTimeStamp(){
        LocalDateTime now = LocalDateTime.now();
        this.timeStamp = now.toString();
        return this;
    }
    
    public ErrorBuilder withKeyWord(String keyWord){
        this.keyWord = keyWord;
        return this;
    }

    
    public ErrorBuilder withDuration(int duration){
        this.duration = duration;
        return this;
    }
    
    @Override
    public Error buildError(){
        Error error  = new Error();
        error.setElementId(this.elementId);
        error.setDuration(this.duration);
        error.setKeyWord(this.keyWord);
        error.setLineCode(this.lineCode);
        error.setTimeStamp(this.timeStamp);
        System.err.print(error);
        exception.printStackTrace();
        return error;
    }
    
}
