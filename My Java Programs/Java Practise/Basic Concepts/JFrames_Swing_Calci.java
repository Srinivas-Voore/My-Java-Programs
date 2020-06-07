package practise;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
public class JFrames_Swing_Calci implements ActionListener
{  
JFrame j;
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5,b6;
JComboBox cb;
JTextArea ta;
JCheckBox ch,ch1;

JFrames_Swing_Calci()
{
String a[]= {"Select","CSE","ECE"};
j=new JFrame("WELCOME");
    l1=new JLabel("INPUT1");
    l2=new JLabel("INPUT 2");
    l3=new JLabel("OUTPUT");
    t1=new JTextField(20);
    t2=new JTextField(5);
    t3=new JTextField(5);
    b1=new JButton("ADD");
    b2=new JButton("SUB");
    b3=new JButton("MUL");
    b4=new JButton("DIV");
    b5=new JButton("MOD");
    b6=new JButton("Submit");
    cb=new JComboBox(a);
    ta=new JTextArea();
    ch=new JCheckBox("C++");
    ch1=new JCheckBox("JAVA");    
    j.setLayout(new FlowLayout());
    // l1.setLocation(300, 100);
    // t1.setSize(100,150);
    // t1.setLocation();
    j.add(l1);
    j.add(t1);
    j.add(l2);
    j.add(t2);
    j.add(l3);
    j.add(t3);
    j.add(b1);
    j.add(b2);
    j.add(b3);
    j.add(b4);
    j.add(b5);
    j.add(cb);
    j.add(ch);
    j.add(ch1);
    j.add(b6);
    // ta.setSize(200,200);
    // ta.setSize(200,200);
    // ta.setLocation(250,250);
    j.add(ta);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    //ta.addActionListener();
    // j.setSize(1000, 1000);
    j.setVisible(true);
   
}
    public static void main(String s[])
    {  
        new JFrames_Swing_Calci();
   
    }
   public void actionPerformed(ActionEvent e)
    {
    String sa,sb,sc;
    if(e.getSource()==b1)
    {
    int a=Integer.parseInt(t1.getText());
    int b=Integer.parseInt(t2.getText());
    int c=a+b;
    t3.setText(Integer.toString(c));
    }
    if(e.getSource()==b2)
    {
    int a=Integer.parseInt(t1.getText());
    int b=Integer.parseInt(t2.getText());
    int c=a-b;
    t3.setText(Integer.toString(c));
    }
    if(e.getSource()==b3)
    {
    int a=Integer.parseInt(t1.getText());
    int b=Integer.parseInt(t2.getText());
    int c=a*b;
    t3.setText(Integer.toString(c));
    }
    if(e.getSource()==b4)
    {
    int a=Integer.parseInt(t1.getText());
    int b=Integer.parseInt(t2.getText());
    int c=a/b;
    t3.setText(Integer.toString(c));
    }
    if(e.getSource()==b5)
    {
    int a=Integer.parseInt(t1.getText());
    int b=Integer.parseInt(t2.getText());
    int c=a%b;
    t3.setText(Integer.toString(c));
    }
    if(e.getSource()==b6)
    {
    sa=(String)cb.getSelectedItem();
        ta.setText(sa);
        if(ch.isSelected())
        {
        sb=ch.getText();
        ta.setText(sb);
        }
        if(ch1.isSelected())
        {
        sb=ch1.getText();
        ta.setText(sb);
        }
       
    }
   
    }
}