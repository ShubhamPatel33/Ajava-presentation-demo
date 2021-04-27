// Java program to construct
// Menu bar to add menu items
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class pr10 extends JFrame {

	static JMenuBar mb;
	static JMenu x;
	static JMenuItem m1, m2, m3;
	static JFrame f;
    static JLabel l1;
	public static void main(String args[])
	{
		f = new JFrame("Menu demo");	
		mb = new JMenuBar();
		x = new JMenu("Menu");
		m1 = new JMenuItem("MenuItem1");
		m2 = new JMenuItem("MenuItem2");
		m3 = new JMenuItem("MenuItem3");
        l1 = new JLabel("Status");
		x.add(m1);
		x.add(m2);
		x.add(m3);
		mb.add(x);
		
		l1.setHorizontalAlignment(SwingConstants.CENTER); 
        l1.setVerticalAlignment(SwingConstants.CENTER);

		f.setJMenuBar(mb);
        f.add(l1);
		f.setSize(500, 500);
		f.setVisible(true);
        m1.addActionListener(new ActionListener(){

  		public void actionPerformed(ActionEvent evt){
        l1.setText("MenueItem1");
  } });
       m2.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent evt){
        l1.setText("MenueItem2");
  } });
       m3.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent evt){
        l1.setText("MenueItem3");
  } });
} }
