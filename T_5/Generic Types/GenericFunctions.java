public class GenericFunctions {

    static public <T,U,W> void printValue(T value) {
        System.out.println(value);
        System.out.println(value.getClass());
    }


    public static void main(String[] args) {
        // printValue(2);
        Integer a = 1;
        System.out.println(a.getClass());
    }
}
