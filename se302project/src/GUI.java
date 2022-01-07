import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

public class GUI extends JFrame{

    int count=0;
    JLabel firstLabel, lastLabel,genderLabel;
    JFrame frame;
    JPanel panel;
    JButton addButton,printButton;
    JTextField firstField, lastField, genderField;
    JTextArea textArea;
    ArrayList<Person>people = new ArrayList<>();

    public GUI(){
        frame = new JFrame();
        firstLabel = new JLabel("First Name:");
        lastLabel = new JLabel("Last Name:");
        genderLabel = new JLabel("Gender:");

        firstField = new JTextField(10);
        lastField=new JTextField(12);
        genderField=new JTextField(12);

        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        textArea =new JTextArea();
        addButton = new JButton("Add Person");
        addButton.addActionListener(new ButtonListener());
        printButton = new JButton("DisplayPerson");
        printButton.addActionListener(new ButtonListener());
        frame.add(panel,BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(800,300));
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
        panel.add(firstLabel);
        panel.add(firstField);
        panel.add(lastLabel);
        panel.add(lastField);
        panel.add(genderLabel);
        panel.add(genderField);


        panel.add(addButton);
        panel.add(printButton);
        frame.add(textArea,BorderLayout.CENTER);

    }
    public static void main(String[] args) {
        new GUI();
    }

    private class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){


            if(e.getSource() == printButton){
                //textArea.append("Display Button pushed\n");
                for(Person p: people){
                    textArea.append(p+"\n");
                }
            }
            else if(e.getSource() == addButton){
                //textArea.append("Add Button pushed\n");
                String firstName = firstField.getText();
                String lastName = lastField.getText();
                String gender = genderField.getText();

                people.add(new Person(firstName,lastName,2000,2022,gender));
                firstField.setText("");
                lastField.setText("");
            }

        }
    }
}
