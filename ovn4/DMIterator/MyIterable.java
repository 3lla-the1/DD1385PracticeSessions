package ovn4.DMIterator;

// Returnerar ett nytt objekt av den klassen vi skapade
public class MyIterable implements Iterable<Double>{
    public Iterator<Double> iterator(){
        return new MyIterator();

        // Lägg till en ny Iterator för DFS och BFS
    }
    
}
