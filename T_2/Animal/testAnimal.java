public class testAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Dog dog = new Dog();

        System.out.println(cat.hungry);
        cat.feed();
        System.out.println(cat.hungry);


        System.out.println(dog.hungry);
        System.out.println(dog.timesFed);
        dog.feed();
        System.out.println(dog.hungry);
        System.out.println(dog.timesFed);




    }
}