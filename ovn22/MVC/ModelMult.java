package MVC;

public class ModelMult implements ModelInterface{
    private double data;

    @Override
    public double getData(double data){
        return data * factor;
    }

    @Override
    public double setData(double data){
        this.data = factor;
    }
    
}
