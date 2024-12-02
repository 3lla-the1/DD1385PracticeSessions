public class SugarDecorator extends CoffeeDecorator {
    

    SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }

    @Override
    public String description() {
        return super.description() + ", with sugar";
    }


}
