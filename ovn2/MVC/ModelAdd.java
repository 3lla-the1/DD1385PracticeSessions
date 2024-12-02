package MVC;

public class ModelAdd implements ModelInterface{
    private double data;

    @Override
    public double getData(double data){
        return data + factor;
    }

    public void setData(double data){
        this.data = data;
    }
    
}
