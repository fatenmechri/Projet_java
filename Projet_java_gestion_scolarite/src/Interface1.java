import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.Parameter;
import java.util.jar.JarOutputStream;

public class Interface1  extends JFrame {
    private JTextField passe;
    private Label textpasse;
    private JButton close;
    private JButton ok;
    public Interface1(){
        super();
        setTitle("idontification ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,500);
        setLocationRelativeTo(null);
        setLayout(null);
        passe=new JPasswordField();
        passe.setBounds(20,150,250,20);
        textpasse=new Label("mode passe");
        textpasse.setBounds(20,120,250,20);
        close=new JButton("close");
        close.setBounds(20,210,100,30);
        ok=new JButton("ok");
        ok.setBounds(150,210,100,30);
        add(passe);
        add(textpasse);
        add(close);
        add(ok);
        ok.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String passee;
                passee = String.valueOf(passe.getText());
                if (passee.equals("issat2024")){
                    showMsg1();
                    // Créer une instance de AddStudentFrame lorsque le bouton "Ajouter" est cliqué
                    MainFrame interface2 = new  MainFrame();
                    interface2.setVisible(true);


                }
                else{
                    showMsg("mode passe in corect");


                }
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
    private void showMsg(String S){
        JOptionPane.showMessageDialog(this,S,"Application",JOptionPane.ERROR_MESSAGE);

    }
    private  void showMsg1(){
        JOptionPane.showMessageDialog(this,"bien veni");
    }



}