import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Screen extends JFrame implements ActionListener {
    User owner; // every screen has an owner
    JTextField input; // input field for message
    JTextArea output; //output field for past messages
    JLabel label;// label to show which window is which
    JButton button; // button that sends the message when clicked
    JPanel panel; // panel to place it all in

    public Screen(User owner) {
        this.owner = owner; 
        this.input = new JTextField(); //instantiate input
        this.input.setPreferredSize(new Dimension(250, 28)); // set the input size
        this.input.setFont(this.input.getFont().deriveFont(20f));  // set font

        this.output = new JTextArea(); // instantiate output
        this.output.setFont(this.output.getFont().deriveFont(20f)); 

        this.label = new JLabel(this.owner.name); //instantiate label
        JScrollPane scroll = new JScrollPane (output, 
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        // wrap output into a ScrollPane so the user can scroll the chat
        scroll.getViewport().setPreferredSize(new Dimension(500, 650));
        // set size

        this.button = new JButton("Send"); // instantiate button
        this.button.addActionListener(this); // add action listener (defined below)

        this.panel = new JPanel();
        this.panel.add(this.label);
        this.panel.add(this.input);
        this.panel.add(this.button);
        this.panel.add(scroll);
        // add everything to panel
        this.add(this.panel);
       // add panel to screen
        this.setSize(550, 800);
        this.panel.setMaximumSize(new Dimension(500,Integer.MAX_VALUE)); // set max size
        this.setResizable(false); // disallow resizing
        this.setVisible(true); // make screen visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	// this runs when the Send button is clicked
        this.owner.broadcast(this.input.getText()); //broadcast message
        this.input.setText(""); //reset input field 

    }

}
