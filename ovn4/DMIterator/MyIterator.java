package ovn4.DMIterator;

// Iterera över saker i väskan och ej double
public class MyIterator implements MyIterator<Double>{
    private long n = 0; // större tal counter

    @Override
    public boolean hasNext(){
        return n<10;
    }

    @Override
    public double Next(){
        // Returnera nästa i loopen
        n++;
        
        // HITTA BREDDEN FÖRST OCH DJUPET FÖRST SOM ÄR SMART
        // Iterationsformel för e 
        return Math.pow(1.0 + 1.0/n, n);

    }

}
