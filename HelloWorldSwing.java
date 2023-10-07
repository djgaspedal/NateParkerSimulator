import javax.swing.*; 
import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * 		
 * 		Free to use and I do not care how you use it/reproduce it.
 * 		Nathaniel is going to be extremely pissed off knowing how cringe this shit is.
 * 		This project is not sponsored by the Church of Latter-Day Saints. I love Mormons though!
 * 		
 * 		
 * 		@djgaspedal ------------------------ Instagram
 * 		https://www.djgaspedal.com --------- Personal Website
 * 		https://www.github.com/djgaspedal -- GH
 * 		
 */

public class HelloWorldSwing implements ImageObserver {
	
    /**
     	* Create the GUI and show it.  For thread safety,
     	* this method should be invoked from the
     	* event-dispatching thread.
    */
    
    static void EventHandlerHelloWorldSwing() {
    	
    	// Schedule a job for the event-dispatching thread:
        // Creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(
        		
        	new Runnable() {
        		public void run() {
        			
        			// Create and set up the window.
        	        JFrame mainFrameContainer = new JFrame("HelloWorldSwing");
        	        mainFrameContainer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	        
        	        // Sets Location of
        	        mainFrameContainer.setBounds(400,400,100, 40);

        	        // Add the ubiquitous "Hello Nate Parker" label.
        	        JLabel label = new JLabel("Hello Nate Parker \n");
        	        mainFrameContainer.getContentPane().add(label);
        	        

        	        // Display the window.
        	        mainFrameContainer.pack();
        	        mainFrameContainer.setVisible(true);
                
        		}
            
        	}
        
        );
        
        // New JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pic = new JPanel();
        ImageIcon pc = new ImageIcon("images/nateParkerImg.jpg");
        JLabel lab = new JLabel(pc, SwingConstants.CENTER);
        
        // Display Params. for the Nate Parker Image
        pic.add(lab);
        frame.add(pic);
        frame.setSize(800, 1000);
        frame.setVisible(true);
        
    }
    
    
    public static void main(String[] args) {
    	
    	// runs EventHandlerHelloWorldSwing() in SimulatorRun.java file
    	
    }

	@Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		return false;
	}
    
}
