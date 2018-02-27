package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgainGui2 extends JFrame {

	private JButton a;
	private JButton b;
	
	public AgainGui2(){
		
		super ("the title");
		setLayout(new FlowLayout());
		
		Icon x = new ImageIcon(getClass().getResource("p.png"));
		b = new JButton("this is 1 ");
		add(b);
		a = new JButton("this is button",x);
		a.setRolloverSelectedIcon(x);
		add(a);
		
		
		
		
		
	}
	
}
