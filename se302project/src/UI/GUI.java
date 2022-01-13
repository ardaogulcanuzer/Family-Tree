package UI;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;

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
    JButton removeButton;

    JMenuBar menuBar;
    JMenu file,edit,help;
    JMenuItem exit,save,about;

    JComboBox cinsiyetBox;
    String[] cinsiyet = {"Kadın", "Erkek"};
    JComboBox akrabaBox;
    String[] akraba = {"Ben", "Baba", "Anne", "Eş", "Kardeş", "Çocuk"};

    JTree FamilyTree;
    DefaultMutableTreeNode reference;
    DefaultMutableTreeNode parents;
    DefaultMutableTreeNode spouse;
    DefaultMutableTreeNode children;
    DefaultMutableTreeNode broSis;


    GUI() {
        //Mainframe name.
        mainFrame = new JFrame("Family Tree");
        file = new JMenu("File");
        file.setFont(new Font("Arial", Font.BOLD, 13));
        edit = new JMenu("Edit");
        edit.setFont(new Font("Arial", Font.BOLD, 13));
        help = new JMenu("Help");
        help.setFont(new Font("Arial", Font.BOLD, 13));
        about = new JMenuItem("About");
        about.addActionListener(this);
        about.setFont(new Font("Arial", Font.BOLD, 13));

        //Addpanel settings.
        addPanel = new JPanel();
        addPanel.setBounds(1500, 20, 400, 960);
        addPanel.setBackground(Color.lightGray);

        //All field settings.
        başlık = new JLabel("Family Tree");
        başlık.setBounds(10, 10 , 200,30);
        başlık.setFont(new Font("Verdana", Font.PLAIN, 24));
        adField = new JTextField();
        soyadField = new JTextField();
        doğumField = new JTextField();
        idField = new JTextField();
        adField.setBounds(1670, 50, 200, 25);
        adLabel = new JLabel("Adı: ");
        adLabel.setBounds(1510, 50, 50, 30);
        adLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        soyadField.setBounds(1670, 130, 200, 25);
        soyadLabel = new JLabel("Soyadı: ");
        soyadLabel.setBounds(1510, 130, 90, 30);
        soyadLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        doğumField.setBounds(1670, 210, 200, 25);
        doğumLabel = new JLabel("Doğum Yılı: ");
        doğumLabel.setBounds(1510, 210, 160, 30);
        doğumLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        idField.setBounds(1670, 290, 200, 25);
        idLabel = new JLabel("ID: ");
        idLabel.setBounds(1510, 290, 160, 30);
        idLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        genderLabel = new JLabel("Cinsiyet: ");
        genderLabel.setBounds(1510, 400, 160, 30);
        genderLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        akrabaLabel = new JLabel("Akraba: ");
        akrabaLabel.setBounds(1510, 500, 160, 30);
        akrabaLabel.setFont(new Font("Verdana", Font.PLAIN, 18));



        cinsiyetBox = new JComboBox(cinsiyet);
        cinsiyetBox.setFont(new Font("Verdana", Font.PLAIN, 18));
        cinsiyetBox.setBounds(1670, 400, 200, 25);

        akrabaBox = new JComboBox(akraba);
        akrabaBox.setFont(new Font("Verdana", Font.PLAIN, 18));
        akrabaBox.setBounds(1670, 500, 200, 30);


        addButton = new JButton("Add Person");
        addButton.setBounds(1510, 910, 180, 50);
        addButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        addButton.addActionListener(this);

        removeButton = new JButton("Remove Person");
        removeButton.setBounds(1710, 910, 180, 50);
        removeButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        removeButton.addActionListener(this);


        reference = new DefaultMutableTreeNode("Reference");
        FamilyTree = new JTree(reference);
        FamilyTree.setBounds(20, 50, 1300, 900);

        parents = new DefaultMutableTreeNode("Ebeveynler");
        spouse = new DefaultMutableTreeNode("Eşler");
        children = new DefaultMutableTreeNode("Çocuklar");
        broSis = new DefaultMutableTreeNode("Kardeşler");

        //idField need to be integer.
        idField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        //doğumField need to be integer.
        doğumField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        //adField need to be string.
        adField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)){
                e.consume();
            }
            }
        });
        //soyadField need to be string.
        soyadField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)){
                    e.consume();
                }
            }
        });

        reference.add(parents);
        reference.add(spouse);
        reference.add(broSis);
        reference.add(children);

        menuBar = new JMenuBar();
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setVisible(true);


        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        help.add(about);
        mainFrame.add(başlık);
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
        mainFrame.add(addButton);
        mainFrame.add(removeButton);
        mainFrame.add(cinsiyetBox);
        mainFrame.add(akrabaBox);
        mainFrame.add(FamilyTree);
        mainFrame.add(addPanel);

    }
    public void resetField(){
        adField.setText("");
        soyadField.setText("");
        doğumField.setText("");
        idField.setText("");
        cinsiyetBox.setSelectedItem(0);
        akrabaBox.setSelectedItem(0);
    }




    public static void main(String[] args) {
        new GUI();
    }


    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == about){
            try{
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"C:\\Users\\doruk\\Documents\\GitHub\\SE-302-PROJECT\\Text\\about.txt");
            }
            catch (Exception txt){
            }
        }

        if(e.getSource() == removeButton){
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) FamilyTree.getSelectionPath().getLastPathComponent();
        if(selectedNode != parents && selectedNode != spouse && selectedNode != broSis && selectedNode != children){

            DefaultTreeModel model = (DefaultTreeModel) FamilyTree.getModel();
            model.removeNodeFromParent(selectedNode);
            model.reload();
    }
    }

        if (e.getSource() == addButton && (akrabaBox.getSelectedIndex() == 0)) {
            if (idField.getText().equals("")) {
                JOptionPane idHata = new JOptionPane();
                idHata.showMessageDialog(null, "ID girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");

            } else if (adField.getText().equals("")) {
                JOptionPane kişiHata = new JOptionPane();
                kişiHata.showMessageDialog(null, "Kişi adı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else if (soyadField.getText().equals("")) {
                JOptionPane soyadHata = new JOptionPane();
                soyadHata.showMessageDialog(null, "Soyadı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else {
                DefaultTreeModel model = (DefaultTreeModel) FamilyTree.getModel();

                reference.setUserObject(adField.getText() + " " + soyadField.getText() + " ID:" + idField.getText() + " (Referans) ");
                model.nodeChanged(reference);
                SwingUtilities.updateComponentTreeUI(mainFrame);
                resetField();


            }
                  }

        if (e.getSource() == addButton && (akrabaBox.getSelectedIndex() == 1)) {

            if (idField.getText().equals("")) {
                JOptionPane idHata = new JOptionPane();
                idHata.showMessageDialog(null, "ID girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");

            } else if (adField.getText().equals("")) {
                JOptionPane kişiHata = new JOptionPane();
                kişiHata.showMessageDialog(null, "Kişi adı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else if (soyadField.getText().equals("")) {
                JOptionPane soyadHata = new JOptionPane();
                soyadHata.showMessageDialog(null, "Soyadı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else if ((cinsiyetBox.getSelectedIndex() == 0)){
                JOptionPane soyadHata = new JOptionPane();
                soyadHata.showMessageDialog(null, "Cinsiyeti kontrol edin.");
            }
            else {
                JOptionPane success = new JOptionPane();
                success.showMessageDialog(null, "Bilgileriniz kaydedilmiştir.");

                DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(adField.getText() + " " + soyadField.getText() + " (BABA) ");
                parents.add(tempNode);
                SwingUtilities.updateComponentTreeUI(mainFrame);
                resetField();
            }
                }

        if (e.getSource() == addButton && (akrabaBox.getSelectedIndex() == 2)) {

            if (idField.getText().equals("")) {
                JOptionPane idHata = new JOptionPane();
                idHata.showMessageDialog(null, "ID girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");

            } else if (adField.getText().equals("")) {
                JOptionPane kişiHata = new JOptionPane();
                kişiHata.showMessageDialog(null, "Kişi adı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else if (soyadField.getText().equals("")) {
                JOptionPane soyadHata = new JOptionPane();
                soyadHata.showMessageDialog(null, "Soyadı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else if ((cinsiyetBox.getSelectedIndex() == 1)){
                JOptionPane soyadHata = new JOptionPane();
                soyadHata.showMessageDialog(null, "Cinsiyeti kontrol edin.");
            } else {
                JOptionPane succes = new JOptionPane();
                succes.showMessageDialog(null, "Bilgileriniz kaydedilmiştir.");

                DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(adField.getText() + " " + soyadField.getText() + " (ANNE) ");
                parents.add(tempNode);
                SwingUtilities.updateComponentTreeUI(mainFrame);
                resetField();
            }
        }

        if (e.getSource() == addButton && (akrabaBox.getSelectedIndex() == 3)) {

            if (idField.getText().equals("")) {
                JOptionPane idHata = new JOptionPane();
                idHata.showMessageDialog(null, "ID girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");

            } else if (adField.getText().equals("")) {
                JOptionPane kişiHata = new JOptionPane();
                kişiHata.showMessageDialog(null, "Kişi adı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else if (soyadField.getText().equals("")) {
                JOptionPane soyadHata = new JOptionPane();
                soyadHata.showMessageDialog(null, "Soyadı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");

            } else {
                JOptionPane succes = new JOptionPane();
                succes.showMessageDialog(null, "Bilgileriniz kaydedilmiştir.");

                DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(adField.getText() + " " + soyadField.getText() + " (EŞ) ");
                spouse.add(tempNode);

                SwingUtilities.updateComponentTreeUI(mainFrame);
                resetField();


            }
        }


        if (e.getSource() == addButton && (akrabaBox.getSelectedIndex() == 4) && (cinsiyetBox.getSelectedIndex() == 0)){

            if (idField.getText().equals("")) {
                JOptionPane idHata = new JOptionPane();
                idHata.showMessageDialog(null, "ID girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");

            } else if (adField.getText().equals("")) {
                JOptionPane kişiHata = new JOptionPane();
                kişiHata.showMessageDialog(null, "Kişi adı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else if (soyadField.getText().equals("")) {
                JOptionPane soyadHata = new JOptionPane();
                soyadHata.showMessageDialog(null, "Soyadı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else {
                JOptionPane succes = new JOptionPane();
                succes.showMessageDialog(null, "Bilgileriniz kaydedilmiştir.");

                DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(adField.getText() + " " + soyadField.getText() + " (KIZ KARDEŞ) ");
                broSis.add(tempNode);
                SwingUtilities.updateComponentTreeUI(mainFrame);
                resetField();
            }
        }
        else if(e.getSource() == addButton && (akrabaBox.getSelectedIndex() == 4) && (cinsiyetBox.getSelectedIndex() == 1)){
            if (idField.getText().equals("")) {
                JOptionPane idHata = new JOptionPane();
                idHata.showMessageDialog(null, "ID girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");

            } else if (adField.getText().equals("")) {
                JOptionPane kişiHata = new JOptionPane();
                kişiHata.showMessageDialog(null, "Kişi adı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else if (soyadField.getText().equals("")) {
                JOptionPane soyadHata = new JOptionPane();
                soyadHata.showMessageDialog(null, "Soyadı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else {
                JOptionPane succes = new JOptionPane();
                succes.showMessageDialog(null, "Bilgileriniz kaydedilmiştir.");

                DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(adField.getText() + " " + soyadField.getText() + " (ERKEK KARDEŞ) ");
                broSis.add(tempNode);
                SwingUtilities.updateComponentTreeUI(mainFrame);
                resetField();
            }

        }
        if (e.getSource() == addButton && (akrabaBox.getSelectedIndex() == 5) && (cinsiyetBox.getSelectedIndex() == 0)) {

            if (idField.getText().equals("")) {
                JOptionPane idHata = new JOptionPane();
                idHata.showMessageDialog(null, "ID girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");

            } else if (adField.getText().equals("")) {
                JOptionPane kişiHata = new JOptionPane();
                kişiHata.showMessageDialog(null, "Kişi adı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else if (soyadField.getText().equals("")) {
                JOptionPane soyadHata = new JOptionPane();
                soyadHata.showMessageDialog(null, "Soyadı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else {
                JOptionPane succes = new JOptionPane();
                succes.showMessageDialog(null, "Bilgileriniz kaydedilmiştir.");

                DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(adField.getText() + " " + soyadField.getText() + " (KIZ ÇOCUK) ");
                children.add(tempNode);
                SwingUtilities.updateComponentTreeUI(mainFrame);
                resetField();
            }

        }
        else if(e.getSource() == addButton && (akrabaBox.getSelectedIndex() == 5) && (cinsiyetBox.getSelectedIndex() == 1)){
            if (idField.getText().equals("")) {
                JOptionPane idHata = new JOptionPane();
                idHata.showMessageDialog(null, "ID girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");

            } else if (adField.getText().equals("")) {
                JOptionPane kişiHata = new JOptionPane();
                kişiHata.showMessageDialog(null, "Kişi adı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else if (soyadField.getText().equals("")) {
                JOptionPane soyadHata = new JOptionPane();
                soyadHata.showMessageDialog(null, "Soyadı girilmedi.");
                throw new StringIndexOutOfBoundsException("HATA");
            } else {
                JOptionPane succes = new JOptionPane();
                succes.showMessageDialog(null, "Bilgileriniz kaydedilmiştir.");

                DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(adField.getText() + " " + soyadField.getText() + " (ERKEK ÇOCUK) ");
                children.add(tempNode);
                SwingUtilities.updateComponentTreeUI(mainFrame);
                resetField();
            }

        }



        }

}


