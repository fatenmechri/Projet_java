import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddStudentFrame extends JFrame {
    public AddStudentFrame() {
        setTitle("Ajouter un étudiant");
        setSize(250, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(20,100,250,20);
        JLabel lblid = new JLabel("id:");
        JTextField txtid = new JTextField(20);
        panel.setBounds(20,150,250,20);
        JLabel lblNom = new JLabel("Nom:");
        JTextField txtNom = new JTextField(20);
        panel.setBounds(20,200,250,20);
        JLabel lblPrenom = new JLabel("Prénom:");
        JTextField txtPrenom = new JTextField(20);
        panel.setBounds(20,250,250,20);
        JLabel lblMatricule = new JLabel("Matricule:");
        JTextField txtMatricule = new JTextField(20);
        panel.setBounds(20,300,250,20);
        JLabel lblmatricule = new JLabel("matricule:");
        JTextField txtmatricule = new JTextField(20);
        panel.setBounds(20,350,250,20);
        JLabel lbldepartement = new JLabel("departement:");
        JTextField txtdepartement = new JTextField(20);
        panel.setBounds(20,400,250,20);
        JLabel lblformatione = new JLabel("formatione:");
        JTextField txtformatione = new JTextField(20);

        JButton btnAdd = new JButton("Ajouter");
        btnAdd.setBounds(220,450,100,30);
        JButton close = new JButton("close");
        close.setBounds(260,500,100,30);
        panel.add(lblid);
        panel.add(txtid);


        panel.add(lblNom);
        panel.add(txtNom);
        panel.add(lblPrenom);
        panel.add(txtPrenom);
        panel.add(lblMatricule);
        panel.add(txtMatricule);

        panel.add(lblmatricule);
        panel.add(txtmatricule);
        panel.add(lbldepartement);
        panel.add(txtdepartement);
        panel.add(lblformatione);
        panel.add(txtformatione);
        panel.add(btnAdd);
        panel.add(close);

        add(panel);

        btnAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        close.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }
}