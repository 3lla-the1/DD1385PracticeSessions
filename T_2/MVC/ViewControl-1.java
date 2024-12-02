import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class ViewControl extends JFrame implements ActionListener {
    private JTextField inputData;
    private JTextField inputFactor;
    private JTextField result;

    private JButton updateButton;

    private ModelInterface model;
    // private ModelInterface model2;




    ViewControl(ModelInterface model) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 500);

        this.model = model;
        this.inputData = new JTextField("asdfadf");
        this.inputFactor = new JTextField();
        this.result = new JTextField();
        this.result.setEditable(false);

        this.updateButton = new JButton("Update");
        this.inputData.setBounds(150, 20, 90, 50);
        this.inputFactor.setBounds(260, 20, 90, 50);
        this.updateButton.setBounds(150, 100, 200, 50);
        this.result.setBounds(150, 180, 200, 50);

        this.updateButton.addActionListener(this);

        this.add(inputData);
        this.add(inputFactor);
        this.add(updateButton);
        this.add(result);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double data = Double.parseDouble(inputData.getText());
        double factor = Double.parseDouble(inputFactor.getText());

        this.model.setData(data);
        double res = this.model.getData(factor);

        this.result.setText(Double.toString(res));

    }


    public static void main(String[] args) {
        ModelInterface add = new ModelAdd();
        ModelInterface mult = new ModelMult();

        // BoardGame fifteenModel = new FifteenModel();
        // BoardGame tictactoe = new Tictactoe();

        new ViewControl(add);
    }


    
}
