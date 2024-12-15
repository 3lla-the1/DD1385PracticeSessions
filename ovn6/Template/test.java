public class test {
    public static void main(String[] args) {
        ComputationTemplate addition = new AdditionOperation();

        int result = addition.performeOperation(2, 5);
        System.out.println(result);


        ComputationTemplate subtraction = new SubtractionOperation();

        int result2 = subtraction.performeOperation(2, 5);
        System.out.println(result2);

    }
}
