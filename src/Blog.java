import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Blog extends JFrame {

    private JPanel contentPane;
    private JTextField nomValue;
    private JTextField prenomValue;
    private JTextField emailValue;
    private JTextField pwd;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Blog frame = new Blog();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Blog() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 782, 632);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setBounds(10, 11, 349, 571);
        contentPane.add(panel);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(369, 11, 387, 571);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("Inscription");
        lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(127, 45, 129, 19);
        panel_1.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nom");
        lblNewLabel_1.setBounds(55, 107, 46, 14);
        panel_1.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Pr\u00E9nom");
        lblNewLabel_1_1.setBounds(55, 167, 46, 14);
        panel_1.add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_3 = new JLabel("Email");
        lblNewLabel_1_3.setBounds(55, 231, 46, 14);
        panel_1.add(lblNewLabel_1_3);

        JLabel lblNewLabel_1_2 = new JLabel("Mot de passe");
        lblNewLabel_1_2.setBounds(55, 289, 80, 14);
        panel_1.add(lblNewLabel_1_2);

        nomValue = new JTextField();
        nomValue.setBounds(168, 107, 165, 20);
        panel_1.add(nomValue);
        nomValue.setColumns(10);

        prenomValue = new JTextField();
        prenomValue.setColumns(10);
        prenomValue.setBounds(168, 168, 165, 20);
        panel_1.add(prenomValue);

        emailValue = new JTextField();
        emailValue.setColumns(10);
        emailValue.setBounds(168, 230, 165, 20);
        panel_1.add(emailValue);

        pwd = new JTextField();
        pwd.setColumns(10);
        pwd.setBounds(168, 285, 165, 20);
        panel_1.add(pwd);

        JButton btnNewButton = new JButton("Je cr\u00E9e mon compte");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, nomValue.getText());
            }
        });
        btnNewButton.setBounds(55, 360, 278, 68);
        panel_1.add(btnNewButton);
    }
}
