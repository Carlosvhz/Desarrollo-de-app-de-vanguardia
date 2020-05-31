package examenvanguardia;

/*
Se considera el caso en el que se crea una clase que representa un error o alerta
cuando una redtiene algún problema. Esta clase se creará tantas veces sea posible
en distintos momentos con diveros parámetros.

*/
public abstract class Builder {
    abstract Error buildError();
}

class Error{
    
    private int elementId;
    private int timeId;
    private String timeStamp;
    private float metric;
    private int metricId;
    private int duration;
    private int interfaceId;
    
    
    public Error(){
    }
    
    // ==> ElementID
    public int getElementId(){
        return elementId;
    }
    
    public void setElementId(int elementId){
        this.elementId = elementId;
    }
    
    // ==> TimeID
    public int getTimeId(){
        return timeId;
    }
    
    public void setTimeId(int timeId){
        this.timeId = timeId;
    }
    
    // ==> TimeStamp
    public String getTimeStamp(){
        return timeStamp;
    }
    
    public void setTimeStamp(String timeStamp){
        this.timeStamp = timeStamp;
    }
    
    // ==> Metric
    public float getMetric(){
        return metric;
    }
    
    public void setMetric(float metric){
        this.metric = metric;
    }
    
    // ==> MetricID
    public float getMetricId(){
        return metricId;
    }
    
    public void setMetricId(int metricId){
        this.metricId = metricId;
    }
    
    // ==> Duration
    public int getDuration(){
        return duration;
    }
    
    public void setDuration(int duration){
        this.duration = duration;
    }
    
    // ==> InterfaceID
    public int getInterfaceId(){
        return interfaceId;
    }
    
    public void setInterfaceId(int interfaceId){
        this.interfaceId = interfaceId;
    }
}

class ErrorBuilder extends Builder{
    
    private int elementId;
    private int timeId;
    private String timeStamp;
    private float metric;
    private int metricId;
    private int duration;
    private int interfaceId;
    
    public ErrorBuilder(int elementId, int timeId, int interfaceId){
        this.elementId = elementId;
        this.timeId = timeId;
        this.interfaceId = interfaceId;
    }
    
    public ErrorBuilder withTimeStamp(String timeStamp){
        this.timeStamp = timeStamp;
        return this;
    }
    
    public ErrorBuilder withMetric(float metric){
        this.metric = metric;
        return this;
    }
    
    public ErrorBuilder withMetricId(int metricId){
        this.metricId = metricId;
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
        error.setInterfaceId(this.interfaceId);
        error.setMetric(this.metric);
        error.setMetricId(this.metricId);
        error.setTimeId(this.timeId);
        error.setTimeStamp(this.timeStamp);
        return error;
    }
    
}
