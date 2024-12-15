package Mediator;
import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }


    public void sendMessage(String msg, User user) {
        for (User u : users) {
            if (u != user) {
                u.receiveMessage(msg);
            }
        }

    }


}
