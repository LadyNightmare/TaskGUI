import java.awt.event.*;
import java.beans.*;
import java.awt.*;

public  class Controller implements ActionListener,PropertyChangeListener{

	private Panel panel;
	
	
		
	public Controller(Panel panel){
		this.panel = panel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("COMENZAR")){
			panel.progress1(0);
			panel.progress2(0);
			panel.clear1();
			panel.clear2();

			int n = panel.number();
			
	
		}
	}
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		

	}

}
