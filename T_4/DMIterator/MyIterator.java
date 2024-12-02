import java.util.Iterator;

public class MyIterator implements Iterator<Double>{
    private long n = 0;


    @Override
    public boolean hasNext() {
        return n < 1000000;
    }

    @Override
    public Double next() {
        n++;
        return Math.pow(1.0 + 1.0/n, n);
    }

}
