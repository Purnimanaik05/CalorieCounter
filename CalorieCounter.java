import java.awt.*;
import java.awt.event.*;

class CalorieCounter extends Frame implements ActionListener{
    Label lbl1, lbl2, lbl3, lbl4;
    TextField txt1, txt2, txt3, txt4;
    Button b1, b2;

    public CalorieCounter() {
        
        lbl1 = new Label("Proteins:");
        lbl2 = new Label("Carbs:");
        lbl3 = new Label("Fats:");
        lbl4 = new Label("Total Energy:");
        txt1 = new TextField(10);
        txt2 = new TextField(10);
        txt3 = new TextField(10);
        txt4 = new TextField(10);
        txt4.setEditable(false);

        Button b1 = new Button("Calculate");
        Button b2 = new Button("Clear");

        lbl1.setBounds(70, 90, 130, 50);
        lbl2.setBounds(70, 140, 130, 50);
        lbl3.setBounds(70, 190, 130, 50);
        lbl4.setBounds(70, 240, 130, 50);

        txt1.setBounds(230, 90, 130, 50);
        txt2.setBounds(230, 135, 130, 50);
        txt3.setBounds(230, 190, 130, 50);
        txt4.setBounds(230, 240, 130, 50);

        b1.setBounds(160, 300, 130, 50);
        b2.setBounds(160, 350, 130, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(lbl1);
        add(txt1);
        add(lbl2);
        add(txt2);
        add(lbl3);
        add(txt3);
        add(lbl4);
        add(txt4);
        add(b1);
        add(b2);

        setLayout(null);
        setSize(400, 400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        double p,c,f,t;
        p = Double.parseDouble(txt1.getText());
        c = Double.parseDouble(txt2.getText());
        f = Double.parseDouble(txt3.getText());
        if(ae.getSource()==b1){
            t = p * 4 + c * 6 + f * 9;
            txt4.setText(t+"");
        }
        if(ae.getSource()==b2){
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
        }
    }
    public static void main(String args[]) {
        CalorieCounter c = new CalorieCounter();
    }

}