package q2;
import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Q2 extends JFrame implements Action{

	JFrame f = new JFrame("Jumpiing castle");
	int headCount = 0;
	int inside = 0;
	int waiting = 0;
	Control c = new Control();
	public Q2() {
		// TODO Auto-generated constructor stub
		 
		
		
		JButton addNew = new JButton("Enter");
		f.setBounds(400,400,400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(addNew);
		JLabel currently = new JLabel("the current people inside are: ");
		JTextField currentPpl  = new JTextField();
		JButton view = new JButton("");
		
//		JButton 
		
		
		f.setLayout(null);
		
		
		f.setVisible(true);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == "addNew") {
			if(c.add() == 1) {
				JOptionPane.showMessageDialog(f, "added successfully");
			}
			else {
				JOptionPane.showMessageDialog(f, "Failed to add new");
			}
		}
		else if (e.getSource() == "view") {
			 currentPpl.setValue =  String.valueOf(c.show());
		}
		else if(e.getSource() == "reset") {
			c.resetCount();
		}
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}
	
	
}
