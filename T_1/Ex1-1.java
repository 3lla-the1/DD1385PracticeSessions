import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1 extends JFrame implements ActionListener {
    JButton button;

    Ex1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);

        button = new JButton();
        button.setBounds(100, 100, 100, 50);
        button.setBackground(Color.BLUE);
        button.setForeground(Color.GREEN);
        button.setText("Hej");
        button.addActionListener(this);

        add(button);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("DET FUNGERAR!");
    }



    public static void main(String[] args) {
        Ex1 myFrame = new Ex1();
    }
    
}
