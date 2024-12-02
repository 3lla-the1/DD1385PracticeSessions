public class test{
    public static void main(String[] args) {
        int i = 0;
        for (double element : new MyIterable()){
            System.out.println(i + " | " + element);
            i++;
        }


    }
}