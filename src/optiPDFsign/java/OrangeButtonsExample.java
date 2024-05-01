package optiPDFsign.java;

	import javax.swing.ImageIcon;
import javax.swing.JButton;
	import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
	import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

	public class OrangeButtonsExample {

	    public OrangeButtonsExample() {
	        JFrame frame = new JFrame("Orange Buttons Example");
	        frame.setSize(800,500);
	        
	    	frame.setLocation(200, 100);
	    	ImageIcon icon = new ImageIcon("icons/potisigh.jpg");
	    	 setIconImage(icon.getImage());
	    
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	      

	        // Create a panel to hold the buttons using FlowLayout
	        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 70, 300)); // Center alignment with 10px horizontal and vertical gap

	        // Create three buttons with orange background color
	        JButton button1 = new JButton("  Buy   ");
	        button1.setBackground(Color.ORANGE);
	        button1.setFont(new Font("Arial", Font.BOLD, 24));
	        button1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	  openWebPage("http://optipdfsigner.myesign.in/");
	            }

				private void openWebPage(String string) {
					 try {
				            Desktop.getDesktop().browse(new URI("http://optipdfsigner.myesign.in/"));
				        } catch (IOException | URISyntaxException e) {
				            e.printStackTrace();
				        }
					
				}
	        });
	        JButton button2 = createOrangeButton("Activate");
	        button2.setBackground(Color.ORANGE);
	        button2.setFont(new Font("Arial", Font.BOLD, 24));
	        button2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                JFrame newFrame = new JFrame();
	                JLabel label = new JLabel("This is a new window!");
	                newFrame.getContentPane().add(label);
	                newFrame.setSize(800,500);
	                newFrame.setLocation(300, 100);
	                newFrame.setVisible(true);
	            }
	        });
	        JButton button3 = createOrangeButton("Continue");
	        button3.setBackground(Color.ORANGE);
	        button3.setFont(new Font("Arial", Font.BOLD, 24));
	        button3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                JFrame newFrame = new JFrame("New Window");
	                JLabel label = new JLabel("This is a new window!");
	                newFrame.getContentPane().add(label);
	                newFrame.setSize(800,500);
	                newFrame.setLocation(300, 100);
	                newFrame.setVisible(true);
	            }
	        });

	        // Add buttons to the panel
	        panel.add(button1);
	        button1.addActionListener(e -> {
	          
	      	 });
	        panel.add(button2);
	        panel.add(button3);

	        // Add the panel to the frame
	        frame.getContentPane().add(panel);
	        


	        // Set the frame visibility
	        frame.setVisible(true);
	    }

	    private void setIconImage(Image image) {
			// TODO Auto-generated method stub
			
		}

		private JButton createOrangeButton(String text) {
	        JButton button = new JButton(text);
	        button.setBackground(Color.ORANGE); // Set background color to orange
	        button.setForeground(Color.BLACK); // Set foreground (text) color to black
	       
	        return button;
	    }

	    public static void main(String[] args) {
	        // Run the GUI code on the Event Dispatch Thread (EDT)
	        SwingUtilities.invokeLater(() -> {
	            new OrangeButtonsExample();
	        });
	    }
	}
	


