public class test {
    public static void main(String[] args) {
        ActualSubject subject = new ActualSubject();

        ActualObserver observer1 = new ActualObserver("Theo1");
        ActualObserver observer2 = new ActualObserver("Theo2");
        ActualObserver observer3 = new ActualObserver("Theo3");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.setState(10);






    }
}
