import java.time.Duration;
import java.time.Instant;

public class stringbuildertest {
    private static int N = 500000;

    private static long getTime(StringBuilder sb) {
        Instant start = Instant.now();

        for (int i = 0; i < stringbuildertest.N; i++) {
            sb.append("a");
        }

        Instant end = Instant.now();
        return Duration.between(start, end).getSeconds();
    }


    private static long getTime(String string) {
        Instant start = Instant.now();

        for (int i = 0; i < stringbuildertest.N; i++) {
            string += "a";
        }

        Instant end = Instant.now();
        return Duration.between(start, end).getSeconds();
    }




    public static void main(String[] arg) {
        // StringBuilder sb = new StringBuilder();
        // System.out.println("Sb class: " + getTime(sb));

        // String string = "";
        // System.out.println("String class: " + stringbuildertest.getTime(string));



        
        System.out.println(stringbuildertest.N);

    }


}
