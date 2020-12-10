import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ConvertorView extends JFrame {
    private JComboBox<String> comboBox=new JComboBox<String>();
    private JComboBox<String> comboBox2=new JComboBox<String>();
    private JButton convert=new JButton("Convert");
    private JLabel suma=new JLabel("Suma: ");
    private JLabel valuta1=new JLabel();
    private JTextField sumaConvertire=new JTextField(20);
    private JLabel rezultat=new JLabel("Rezultat: ");
    private JLabel valuta2=new JLabel();
    private JTextField sumaConvertit=new JTextField(20);

    private ConvertorModel cModel;

    ConvertorView(ConvertorModel model){
        cModel=model;
        cModel.suma=(ConvertorModel.INITIAL_VALUE);


        comboBox.addItem("EUR");
        comboBox.addItem("RON");
        comboBox.addItem("USD");
        comboBox.setBorder(BorderFactory.createEmptyBorder(20,40,20,40));
        comboBox2.addItem("EUR");
        comboBox2.addItem("RON");
        comboBox2.addItem("USD");
        comboBox2.setBorder(BorderFactory.createEmptyBorder(20,40,20,40));

        JPanel conv1=new JPanel();
        conv1.setLayout(new FlowLayout());
        suma.setSize(50,5);
        conv1.add(suma);
        conv1.add(sumaConvertire);
        conv1.add(valuta1);
        JPanel conv2=new JPanel();
        conv2.setLayout(new FlowLayout());
        conv2.add(rezultat);
        conv2.add(sumaConvertit);
        conv2.add(valuta2);
        JPanel conv=new JPanel();
        conv.setLayout(new GridLayout(2,1));
        conv.add(conv1);
        conv.add(conv2);

        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(comboBox);
        panel.add(convert);
        panel.add(comboBox2);

        JPanel pane=new JPanel();
        pane.setLayout(new GridLayout(3,1));
        pane.add(panel);
        pane.add(conv);

        this.setContentPane(pane);
        this.pack();

        this.setTitle("Currency Convertor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    String getUserInput() {
        return sumaConvertire.getText();
    }
    void setTotal(String newTotal) {
        sumaConvertit.setText(newTotal);
    }
    void addConvertListener(ActionListener cv){convert.addActionListener(cv);}
    String getCurrency1(){ return (String) comboBox.getSelectedItem();}
    String getCurrency2(){ return (String) comboBox2.getSelectedItem();}
    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
        sumaConvertit.setText("");
    }
    void rez(Double r){sumaConvertit.setText(String.valueOf(r));}
}
