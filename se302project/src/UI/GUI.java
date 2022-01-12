package UI;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame mainFrame;
    JPanel addPanel;
    JTextField adField;
    JTextField soyadField;
    JTextField doğumField;
    JTextField idField;
    JLabel başlık;
    JLabel adLabel;
    JLabel soyadLabel;
    JLabel doğumLabel;
    JLabel idLabel;
    JLabel genderLabel;
    JLabel akrabaLabel;
    JButton addButton;
    JComboBox cinsiyetBox;
    String[] cinsiyet = { "Kadın", "Erkek" };
    JComboBox akrabaBox;
    String[] akraba = { "Ben", "Baba", "Anne", "Kardeş", "Çocuk" };

    JTree FamilyTree;
    DefaultMutableTreeNode reference;
    DefaultMutableTreeNode parents;
    DefaultMutableTreeNode spouse;
    DefaultMutableTreeNode children;
    DefaultMutableTreeNode broSis;



    GUI(){
        //Mainframe name.
        mainFrame = new JFrame("Family Tree");

        //Addpanel settings.
        addPanel = new JPanel();
        addPanel.setBounds(1500, 10, 400, 1000);
        addPanel.setBackground(Color.gray);

        //All field settings.
        adField = new JTextField();
        soyadField = new JTextField();
        doğumField = new JTextField();
        idField = new JTextField();
        adField.setBounds(1670, 20, 200,25);
        adLabel = new JLabel("Adı: ");
        adLabel.setBounds(1510,20,50,30);
        adLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        soyadField.setBounds(1670, 100, 200,25);
        soyadLabel = new JLabel("Soyadı: ");
        soyadLabel.setBounds(1510,100,90,30);
        soyadLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        doğumField.setBounds(1670, 180, 200,25);
        doğumLabel = new JLabel("Doğum Tarihi: ");
        doğumLabel.setBounds(1510,180,160,30);
        doğumLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        idField.setBounds(1670, 260, 200,25);
        idLabel = new JLabel("ID: ");
        idLabel.setBounds(1510,260,160,30);
        idLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        genderLabel = new JLabel("Cinsiyet: ");
        genderLabel.setBounds(1510,400,160,30);
        genderLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        akrabaLabel = new JLabel("Akraba: ");
        akrabaLabel.setBounds(1510,500,160,30);
        akrabaLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        başlık = new JLabel("Family Tree ");
        başlık.setBounds(20,0,160,30);
        başlık.setFont(new Font("Verdana", Font.PLAIN, 22));



        cinsiyetBox = new JComboBox(cinsiyet);
        cinsiyetBox.setFont(new Font("Verdana", Font.PLAIN, 18));
        cinsiyetBox.setBounds(1670, 400, 200, 25);

        akrabaBox = new JComboBox(akraba);
        akrabaBox.setFont(new Font("Verdana", Font.PLAIN, 18));
        akrabaBox.setBounds(1670, 500, 200, 30);



        addButton = new JButton("Add Person");
        addButton.setBounds(1670,940,200,50);
        addButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        addButton.addActionListener(this);

        reference = new DefaultMutableTreeNode("Reference");
        FamilyTree = new JTree(reference);
        FamilyTree.setBounds(20, 50, 1300, 900);

        parents = new DefaultMutableTreeNode("Ebeveynler");
        spouse = new DefaultMutableTreeNode("Eşler");
        children = new DefaultMutableTreeNode("Çocuklar");
        broSis = new DefaultMutableTreeNode("Kardeşler");

        reference.add(parents);
        reference.add(spouse);
        reference.add(broSis);
        reference.add(children);




        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setVisible(true);

        mainFrame.add(adField);
        mainFrame.add(adLabel);
        mainFrame.add(soyadField);
        mainFrame.add(soyadLabel);
        mainFrame.add(doğumField);
        mainFrame.add(doğumLabel);
        mainFrame.add(idField);
        mainFrame.add(idLabel);
        mainFrame.add(genderLabel);
        mainFrame.add(akrabaLabel);
        mainFrame.add(başlık);
        mainFrame.add(addButton);
        mainFrame.add(cinsiyetBox);
        mainFrame.add(akrabaBox);
        mainFrame.add(FamilyTree);
        mainFrame.add(addPanel);


    }


    public static void main(String[] args) {
        new GUI();
    }


     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == addButton && (akrabaBox.getSelectedIndex() == 0)) {
             DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(
                     adField.getText() + " " + soyadField.getText());
             // root = new DefaultMutableTreeNode(tempNode);

             // Changing the text of the root value
             DefaultTreeModel model = (DefaultTreeModel) FamilyTree.getModel();
             reference = (DefaultMutableTreeNode) model.getRoot();
             reference.setUserObject(adField.getText() + " " + soyadField.getText() + idField.getText() + "(Kendisi)");
             model.nodeChanged(reference);

             SwingUtilities.updateComponentTreeUI(mainFrame); // reload the firstPanel after every person add


         }

     }
     }

