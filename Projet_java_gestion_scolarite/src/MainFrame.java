import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.Parameter;
import java.util.jar.JarOutputStream;

public class  MainFrame extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button6;
    private JButton button5;

    public   MainFrame(){
        super();
        setTitle("sevise de gestion scolarite ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setLayout(null);
        button6=new JButton("Ajouter");
        button6.setBounds(220,50,100,30);
        button1=new JButton("Afficher");
        button1.setBounds(220,100,100,30);
        button2=new JButton("Modifier");
        button2.setBounds(220,150,100,30);
        button3=new JButton("Supprimer");
        button3.setBounds(220,200,100,30);
        button4=new JButton("close");
        button4.setBounds(220,250,100,30);






        add(button6);

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        button6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddStudentFrame interface3 = new  AddStudentFrame();
                interface3.setVisible(true);


            }
        });
        button4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        setVisible(true);


    }
}
