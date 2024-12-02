public class MilkDecorator extends CoffeeDecorator {
    

    MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 5.0;
    }

    @Override
    public String description() {
        return super.description() + ", with milk";
    }


}
