// ärver funktionalitet från jframe

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;         //Inpoertar allt 

public class ovn1 extends JFrame implements ActionListener{

    public ovn1(){
        
        JButton button;                                 //tilljängligt globalt

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);                       //

        button = new JButton();      //
        button.setBounds(100,100,100,50);   //exakt postioion 
        button.setBackground(Color.RED);
        button.setForeground(Color.RED);
        button.setText("hej");
        button.addActionListener(this);                     // Pekar till instansen 

        add(button);
        setVisible(true);
    }


    @Override 
    public void actionPerformed(ActionEvent e){
        System.out.println("Funkar");
    }

    public static void main(String[] args) {
      new ovn1();
    }

}