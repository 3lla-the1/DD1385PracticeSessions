public class GenericClass<T, U> {
    private T value;
    private U value2;

    public GenericClass(T value) {
        this.value = value;
        System.out.println(value);
    }


    public static void main(String[] args) {
        GenericClass<Double, Integer> a = new GenericClass<>(2.0);
        GenericClass<String, Double> b = new GenericClass<>("hallå");

    }


}
