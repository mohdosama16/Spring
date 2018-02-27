package practice;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import javax.swing.event.*;

public class Gui2 extends JFrame {
	
	private JList left;
	private JList right;
	private JButton move;
	public static String[] food ={"briyani","kabab","pizza","tand"};
	
	 public Gui2(){
		 super ("foods");
		 setLayout(new FlowLayout());
		 
		 left = new JList(food);
		 left.setVisibleRowCount(3);
		 left.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		 add(new JScrollPane(left));
		 
		 move = new JButton("move left--------->");
		 move.addActionListener(new ActionListener() {
			 
						public void actionPerformed(ActionEvent event) {
							
				
			}
		});
		 
		 
		 
	 }
	
	
	
	}
	

	

