package MVC;

import javax.swing.*;
import java

public class ViewControl extends JFrame implements ActionListner{
    private JTextField inputData;
    private JTextField inputFactor;
    private JTextField result;

    private JButton updateButton;

    // vievotol vile model 
    private ModelInterface model;

    ViewControl(ModelInterface model(JFrame.EXIT_ON_CLOSE);
    setDefaultCloseOperation();
    this.model = model;

    this.inputData = new JTextField();
    this.inputFactor = new JTextField();
    this.result = new JTextField();
    this.result.setEditable(false);

    this.updateButton = new JButton("Update");

    this.inputData.setBounds(150,20,90,50);
    this.inputFactor.setBounds(260,20,90,50);
    this.inputData.setBounds(260,20,90,50);

    this.updateButton.addActionListener(this);

    this.add(inputData);
    this.add(inputFactor);
    this.add(updateButton);

    set.visible(true);
    
}

@Override 
public void actionPerformed(ActionEvent e){
    // Kommunicera med modellen
    // kommunikationen mellan viewcontrol och interface ör mellan metoden och (view bara anropa de 3 med spelen med dem 3! gemensamt som kan kommuniceras med view control )
    double data = Double.parseDouble(inputData.getText());
    double factor = Double.parseDouble(inputFacor.getText());

    // Använda modellen (en set och get)funkar med vilken modell som helst.
    this.model.setData(data);
    double res = this.model.getData(factor);

    this.result.setText(Double.toString(res)); 
}

public static void main(String[] args) {
    ModelInterface add = new ModelAdd();

    // ÄNDRA MODELLEN I vilken modell som tas in av viewControl 
    new ViewControl(add);
}

}

// Uppgift 5: Mock objekt!
// Implementera utan logik men som följer designmönstret 
// kan sära på att testa view control med ett mock object.
