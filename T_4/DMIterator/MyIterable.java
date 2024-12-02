import java.util.Iterator;

public class MyIterable implements Iterable<Double> {
    public Iterator<Double> iterator() {
        // return new MyIterator();
        return new Fibonacci();
    }
}
