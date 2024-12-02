package ovn4.DMIterator;

public class test {
    public static void main(String[] args){

        // Istället för lista skriv en klass
        // for (int element : lista){
        //     System.out.println(element);
        // }

        for (Double element : new MyIterable()){
            System.out.println(element);
        }





    }
    
}
