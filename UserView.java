import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

// View - GUI สำหรับรับข้อมูลและแสดงผล
public class UserView extends JFrame {
    private JTextField nameField = new JTextField(20);
    private JTextField ageField = new JTextField(5);
    private JButton submitButton = new JButton("Submit");
    private JLabel resultLabel = new JLabel("Enter your details");

    public UserView() {
        setTitle("User Information");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Age:"));
        add(ageField);
        add(submitButton);
        add(resultLabel);

        setVisible(true);
    }

    public String getNameInput() {
        return nameField.getText();
    }

    public int getAgeInput() {
        try {
            return Integer.parseInt(ageField.getText());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void setResult(String result) {
        resultLabel.setText(result);
    }

    public void addSubmitListener(ActionListener listener) {
        submitButton.addActionListener(listener);
    }
}
