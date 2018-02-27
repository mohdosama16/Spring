package practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame {

	
	private JList l;
	private static String[] cn ={"red","white","black","green"};
	private static Color[] c={Color.red,Color.white,Color.BLACK,Color.green};
	
	public Gui(){
		super("Cirusslabs");
		setLayout(new FlowLayout());
		l = new JList(cn);
		l.setVisibleRowCount(4);
		l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(l));
		
		l.addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent event) {
				getContentPane().setBackground(c[l.getSelectedIndex()]);
				
				
				
			}
		});
		
		
		
		
	}
		
		
		
	}
		
		
	


