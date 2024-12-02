public class ModelAdd implements ModelInterface{
    private double data;


    @Override
    public double getData(double factor) {
        return data + factor;
    }

    @Override
    public void setData(double data) {
        this.data = data;
    }
}
