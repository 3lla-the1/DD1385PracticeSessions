package MVC;

public class MockObject implements ModelInterface{
    private double data;

    @Override
    public double getData(double data){
        return 1;
    }

    public void setData(double data){
        this.data = 0;
    }
    