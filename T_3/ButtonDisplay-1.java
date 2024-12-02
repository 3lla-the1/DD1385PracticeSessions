import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDisplay extends JFrame implements ActionListener{

    JPanel buttonPanel;
    JButton[] buttons;
    JTextField display;
    String buttonText = "123456789*0#";
    StringBuilder buffert;

    ButtonDisplay() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        buttons = new JButton[12];
        buffert = new StringBuilder();
        display = new JTextField("Test");
        display.setEditable(false);

        buttonPanel = new JPanel();
        buttonPanel.setSize(300, 400);
        buttonPanel.setLayout(new GridLayout(4, 3));


        for (int i = 0; i < buttonText.length(); i++) {
            buttons[i] = new JButton(buttonText.substring(i, i+1));
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        add(buttonPanel, BorderLayout.CENTER);
        add(display, BorderLayout.SOUTH);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();

        if (event.equals("*")){
            buffert = new StringBuilder();
        } else if (event.equals("#")){
            buffert.deleteCharAt(buffert.length()-1);
        } else {
            buffert.append(event);
        }

        display.setText(buffert.toString());

    }



    public static void main(String[] args){
        new ButtonDisplay();
    }
}