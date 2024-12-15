package Mediator;
public class ActualUser extends User {
    

    public ActualUser(Mediator m, String name) {
        super(m, name);
    }


    @Override
    public void sendMessage(String msg) {
        System.out.println(name + " sends: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(name + " receives: " + msg);
    }


}
