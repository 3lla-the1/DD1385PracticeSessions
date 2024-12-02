public class MockObject implements ModelInterface{
    private double data;

    @Override
    public double getData(double factor) {
        return 1;
    }

    @Override
    public void setData(double data) {
        this.data = 0;
    }
}
