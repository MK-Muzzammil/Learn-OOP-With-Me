import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Notepad extends JFrame implements ActionListener, WindowListener {
    JTextArea jta=new JTextArea(); //JtextArea is for making the area of notepad where user enter text
    File fnameContainer;

    public Notepad(){
        Font f=new Font("Arial",Font.BOLD,25);//From java.awt for setting the font of any type with size in text area
        Container con=getContentPane(); //From package java.awt
        JMenuBar jab=new JMenuBar();  //Making the menu bar by javx.swing package
        JMenu jmFile=new JMenu("Files");//we are making buttons by tha names we can aslo chnage name
        JMenu jmEdit=new JMenu("Edit");
        JMenu jmHelp=new JMenu("Help");
        JMenu jmHelp1=new JMenu("Help1");

        con.setLayout(new BorderLayout()); //Set the birder Layout
        JScrollPane sbrText=new JScrollPane(jta);
        sbrText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sbrText.setVisible(true);  //it is used to make text visible to us if we do it false it will not visible

        jta.setFont(f);
        jta.setVisible(true);
        jta.setWrapStyleWord(true);

        con.add(sbrText);

        //Sub Buttons for the file Button lets code All the sub buttons added to perform functionality
        createMenuItem(jmFile,"New");  //subitems in the file button
        createMenuItem(jmFile,"Open");
        createMenuItem(jmFile,"Save");
        jmFile.addSeparator();  //for a Line Seperator after save subbutton which will seperate exit sub button
        createMenuItem(jmFile,"Exit");

        //Subbuttons of the edit BUtton
        createMenuItem(jmEdit,"Cut ");
        createMenuItem(jmEdit,"Copy ");
        createMenuItem(jmEdit,"Paste ");

        //Sub BUtons for the help Button
        createMenuItem(jmHelp,"About Notepad ");
        createMenuItem(jmHelp1,"About Notepad Info");
        //now I have to add these all buttons in JMenuBar our main bar we can aslo add more buttons

        jab.add(jmFile);
        jab.add(jmEdit);
        jab.add(jmHelp);
        jab.add(jmHelp1);

        //now i have set the Menu bar  after All buttons set the menu bar so that no other button is to be addded
        setJMenuBar(jab);

        setIconImage(Toolkit.getDefaultToolkit().getImage("notepad.gif"));
        addWindowListener(this);
        setSize(500,500);     //Setting size of our window
        setTitle("Muzammil.txt - Notepad");
        setVisible(true);  //i have make it visible
    }
    //Now i have to make the functions for SetMenuItems Line open ,Save etc

    public void createMenuItem(JMenu jm,String txt){
        JMenuItem jmi=new JMenuItem(txt);
        jmi.addActionListener(this); //To listen our Action which i have performed
        jm.add(jmi);  //add it to our menu
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser jfc=new JFileChooser();
        if(e.getActionCommand().equals("New")){
            this.setTitle("Muzammil.txt - Notepad");
            jta.setText("");
            fnameContainer =null;

        }
        else if(e.getActionCommand().equals("Open")){
            int ret=jfc.showDialog(null,"Open");
            //check weither filechooser is corret or not
            if(ret==JFileChooser.APPROVE_OPTION){
                try{
                    File fy1=jfc.getSelectedFile();
                    openFile(fy1.getAbsolutePath());
                    this.setTitle(fy1.getName()+" - Notepad"); //taking the name from user
                    fnameContainer=fy1;


                }
                catch(Exception er){
                    System.out.println("Exception Handled");
                }
            }

        }else if(e.getActionCommand().equals("Save")){

            if(fnameContainer!=null){ //if file exists then this if cond
                jfc.setCurrentDirectory(fnameContainer);
                jfc.setSelectedFile(fnameContainer);
            }
            else{//otherowse we have to create new File
                jfc.setSelectedFile(new File("Untitled.txt"));
            }
            int ret=jfc.showSaveDialog(null);
            //Second cond to check first for check file exist second
            if(ret==JFileChooser.APPROVE_OPTION){
                try{
                    File fy1=jfc.getSelectedFile();
                    saveFile(fy1.getAbsolutePath());
                    this.setTitle(fy1.getName()+" - Notepad");
                    fnameContainer=fy1;
                }catch(Exception ers){}
            }

        }else if(e.getActionCommand().equals("Exit")){
            Exiting();
        }
        else if(e.getActionCommand().equals("Copy ")){
            jta.copy();
        }
        else if(e.getActionCommand().equals("Paste ")){
            jta.paste();
        }
        else if(e.getActionCommand().equals("About Notepad ")){
            JOptionPane.showMessageDialog(this,"Created by Muzzammil","Notepad",JOptionPane.INFORMATION_MESSAGE);

        }
        else if(e.getActionCommand().equals("About Notepad Info")){
            JOptionPane.showMessageDialog(this,"Created by Muzzammil \nIf u want notepad like this Contact #03013514508\nJust Made for Practise Purpose","Notepad",JOptionPane.INFORMATION_MESSAGE);

        }
        else if(e.getActionCommand().equals("Cut ")){
            jta.cut();   //the cut copy and paste function is already given
        }
    }
    public void openFile(String fname) throws IOException{
        //making object of buffered reader to reads the file given
        BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream(fname)));
        String l;
        jta.setText("");
        setCursor(new Cursor(Cursor.WAIT_CURSOR));

        //read all the data whenever it goes to null
        while((l= bf.readLine())!=null){
            jta.setText(jta.getText()+l+"\r\n");
        }
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        bf.close();
    }

    public void saveFile(String fname) throws IOException{
        setCursor(new Cursor(Cursor.WAIT_CURSOR));
        DataOutputStream o=new DataOutputStream(new FileOutputStream(fname));
        o.writeBytes(jta.getText());  //o.writeByte for int And o.writeBytes for String
        o.close();
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {


    }
    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        Exiting();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }
    public void Exiting(){
        System.exit(0);  //totally exit the system
    }




}
