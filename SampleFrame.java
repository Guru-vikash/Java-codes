// import java.awt.*;
// import java.awt.event.*;
//  class SampleFrame implements ActionListener, WindowListener, TextListener
// {
// private Frame f = null;
// private Button b1 = null;
// private TextField t1,t2,t3,t4 = null;
// private Label l1,l2,l3,l7 = null;
// private String s1,s2,s3,result;
// public static void main(String []args)
// {
// SampleFrame sf = new SampleFrame();
// }
// public SampleFrame()
// {
// f = new Frame("Student Marks Calculate");
// f.setLayout(new FlowLayout());
// f.addWindowListener(this);
// f.setSize(600,400);
// f.setResizable(true);
// f.setVisible(true);
// l1 = new Label("Student Name");
// f.add(l1);
// t1 = new TextField(50);
// t1.addTextListener(this);
// f.add(t1);

// l2 = new Label("Student Marks");
// f.add(l2);
// t2 = new TextField(50);
// t2.addTextListener(this);
// f.add(t2);
// l3 = new Label("Out Of Marks");
// f.add(l3);
// t3 = new TextField(50);
// t3.addTextListener(this);
// f.add(t3);
// b1 = new Button("Calculate Percentage");
// b1.addActionListener(this);
// f.add(b1);
// l7 = new Label("Percentage");
// l7.setVisible(false);
// f.add(l7);
// t4 = new TextField(50);
// t4.setEditable(false);
// t4.setVisible(false);
// f.add(t4);
// }
// public void actionPerformed(ActionEvent ae)
// {
// if(ae.getSource() == b1)
// {
// s1 = t1.getText();
// s2 = t2.getText();
// s3 = t3.getText();
// double marks = Double.parseDouble(s2);
// double outofmarks = Double.parseDouble(s3);

// double calculate_marks = marks*100/outofmarks;
// result = String.valueOf(calculate_marks);
// t4.setText(result);
// l7.setVisible(true);
// t4.setVisible(true);
// System.out.println("Button clicked");
// }
// }
// public void textValueChanged(TextEvent e)
// {
// s1 = t1.getText();

// s2 = t2.getText();

// s3 = t3.getText();

// }
// public void windowClosing(WindowEvent we)
// {
// System.out.println("In windowClosing");
// f.dispose();
// }
// public void windowClosed(WindowEvent we)
// {
// System.out.println("In windowClosed");
// System.exit(0);
// }
// public void windowOpened(WindowEvent we)
// {
// System.out.println("In windowOpened");
// }
// public void windowActivated(WindowEvent we)
// {
// System.out.println("In windowActivated");
// }

// public void windowDeactivated(WindowEvent we)
// {
// System.out.println("In windowDeactivated");
// }
// public void windowIconified(WindowEvent we)
// {
// System.out.println("In windowIconified");
// }
// public void windowDeiconified(WindowEvent we)
// {
// System.out.println("In windowDeiconified");
// }
// }
import java.awt.*;
import java.awt.event.*; 
class P24 extends Frame implements ActionListener 
{ 
TextField stud_name, stud_marks, stud_per; int total, marks;
float per; 
public P24(String name, int total, int marks) 
{ 
	this.total =total; 	this.marks = marks; 
stud_name = new TextField(); 
stud_name.setBounds(60, 50, 170, 20); stud_name.setText(name); 
stud_name.setEditable(false); 
stud_marks = new TextField(); 
stud_marks.setBounds(60, 100, 
170,20);
stud_marks.setText(marks + "/" + total);
 stud_marks.setEditable(false); 
Button b = new Button("Calculate Percentage"); 
b.setBounds(60, 190, 140, 30); stud_per = new TextField(); 
stud_per.setBounds(60, 150, 170, 20); stud_per.setText("Percentage"); 
stud_per.setEditable(false); 
b.addActionListener(this); 	add(b); 
add(stud_name); 
add(stud_marks); 
add(stud_per); 
setSize(300,300);setLayout(null); setVisible(true); 
} 
public void actionPerformed(ActionEvent e) 
{ 

per =(marks * 100) / total; stud_per.setText(per + "%"); 
} 
public static void main(String args[]) 
{ 
new P24("dharmik", 100, 85); 
} 
} 

