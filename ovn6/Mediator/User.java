package Mediator;
abstract class User {
    public Mediator mediator;
    public String name;

    public User(Mediator m, String n) {
        this.mediator = m;
        this.name = n;
    }

    public abstract void sendMessage(String msg);
    public abstract void receiveMessage(String msg);



}