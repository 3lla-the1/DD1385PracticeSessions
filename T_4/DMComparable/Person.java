class Person implements Comparable<Person> {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        if (this.name.length() < other.name.length()) {
            return 1;
        } else if (this.name.length() == other.name.length()){
            if (this.age < other.age) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Person: [name=" + this.name + ", age=" + this.age + "]";
    }

}