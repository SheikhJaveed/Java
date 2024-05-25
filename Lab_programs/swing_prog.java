import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class swing_prog
{
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(
		new Runnable()
		{
			public void run()
			{
				JFrame f = new JFrame("Calculator");
				f.setSize(800,600);
				f.setVisible(true);
				f.setLayout(new GridLayout(4,2));
			
				
				JLabel n1 = new JLabel("Number 1: ");
				f.add(n1);
				
				JTextField n1_val = new JTextField();
				f.add(n1_val);
				
				JLabel n2 = new JLabel("Number 2: ");
				f.add(n2);
				
				JTextField n2_val = new JTextField();
				f.add(n2_val);
				
				JLabel ans = new JLabel("Answer: ");
				f.add(ans);
				
				JLabel ans_val = new JLabel();
				f.add(ans_val);
				
				JButton add = new JButton("+");
				f.add(add);
				
				JButton subtract = new JButton("-");
				f.add(subtract);
				
				
				ActionListener onClicked = new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						try
						{
							int num1 = Integer.parseInt(n1_val.getText());
							int num2 = Integer.parseInt(n2_val.getText());
							int res;
							
							if(event.getSource() == subtract)
								res = num1 - num2;
							else
								res = num1 + num2;
								
							ans_val.setText(Integer.toString(res));
						}
						catch(Exception e)
						{
							ans_val.setText("ERROR!");
						}
					}
				};
				
				subtract.addActionListener(onClicked);
				add.addActionListener(onClicked);
				
			}
		});
	}
}

