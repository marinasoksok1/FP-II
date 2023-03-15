import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JTextField myTextField;
    private JButton button1;
    private JPanel myPanel;

    public MainForm() {
        setTitle("Port Management");
        setContentPane(myPanel);
        setSize(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Class1 class1 = new Class1(1);
                class1.setStr(myTextField.getText());
                myTextField.setText("The value has bee read and it is "+class1.getStr());
            }
        });
    }

    public static void main(String[] args) {
        MainForm mainForm= new MainForm();
    }
}
