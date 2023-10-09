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
	
	
	
	static void button1DisplayerMethod(JFrame localFrame) { 
    	
        JButton b = new JButton("Click Here For One Piece Rule34");
        localFrame.add(b);
        
        b.setBounds(200, 200, 275, 75); //positionX, positionY, width, height ||| orig: 20,50
        
        
    }
	
    static void nateParkerImageDisplayer(JFrame localFrame) {
        
        JPanel pic = new JPanel();
        ImageIcon pc = new ImageIcon("images/nateParkerImg.jpg");
        JLabel lab = new JLabel(pc, SwingConstants.CENTER);
         
        // Display Params. for the Nate Parker Image
        pic.add(lab);
        
        //adds pic and sets Visible/Size
        localFrame.add(pic);
        localFrame.setSize(800, 1000);
        localFrame.setVisible(true);
    }
    
    static void EventHandlerHelloWorldSwing() {
    	
    	
    	final JFrame mainFrameContainer = new JFrame("HelloWorldSwing");
    	mainFrameContainer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	final JFrame mainImageContainer = new JFrame();
        mainImageContainer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	// Schedule a job for the event-dispatching thread:
        // Creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(
        		
        	new Runnable() {
        		public void run() {
        			
        			// Create and set up the window.
        	        //mainFrameContainer = new JFrame("HelloWorldSwing");
        	        mainFrameContainer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	        
        	        // Sets Location of
        	        mainFrameContainer.setBounds(250, 250, 400, 400);

        	        // Add the ubiquitous "Hello Nate Parker" label.
        	        JLabel label = new JLabel("Hello Nate Parker \n");
        	        mainFrameContainer.getContentPane().add(label);
        	        label.setSize(150, 40);
        	        

        	        // Display the window.
        	        mainFrameContainer.pack();
        	        mainFrameContainer.setVisible(true);
                
        		}
            
        	}
        
        );
        
        button1DisplayerMethod(mainImageContainer);
        nateParkerImageDisplayer(mainImageContainer);
        
    }
    
    
    @Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		
		return false;
	}
    
    public static void main(String[] args) {
    	// runs EventHandlerHelloWorldSwing() in SimulatorRun.java file 
    }

}
