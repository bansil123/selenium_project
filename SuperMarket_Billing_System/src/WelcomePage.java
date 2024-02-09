import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame {
    private JPanel WelcomePagePanel;
    private JLabel welcomePageTitle;
    private JLabel userOptionLabel;
    private JButton adminLoginBtn;
    private JButton employeeLoginBtn;

    public WelcomePage(){
        setContentPane(WelcomePagePanel);
        setTitle("Supermarket app");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth()-50, (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()-150);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        employeeLoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new WelcomePage();
    }
}
