import javax.swing.*;
public class ModifyStudentFrame extends JFrame {
    public ModifyStudentFrame() {
        setTitle("Modifier un étudiant");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();

        // Ajoutez ici le code pour récupérer les étudiants depuis la base de données et les afficher dans une liste déroulante ou une table

        JButton btnModify = new JButton("Modifier");

        panel.add(btnModify);

        add(panel);

        setVisible(true);
    }
}
