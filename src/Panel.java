import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel extends JPanel{

	private JLabel label = new JLabel("Number of loops: ");

	private JTextField sizeLabel = new JTextField(16);
	private JButton startButton = new JButton("START");
	
	private JTextField pi1 = new JTextField(16);
	private JTextField pi2 = new JTextField(16);
	
	private JProgressBar progress1 = new JProgressBar(0,100);
	private JProgressBar progress2 = new JProgressBar(0,100);

	
	
	public Panel(){
		this.setLayout(new GridLayout(3,1,0,0));
		JPanel row1=new JPanel();
		row1.add(label);
		row1.add(sizeLabel);
		row1.add(startButton);
		this.add(row1);
		
		JPanel row2=new JPanel();
		row2.add(new JLabel("Montecarlo"));
		progress1.setStringPainted(true);
		row2.add(progress1);
		row2.add(pi1);
		this.add(row2);

		JPanel row3=new JPanel();
		row3.add(new JLabel("Series GLe."));
		progress2.setStringPainted(true);
		row3.add(progress2);
		row3.add(pi2);
		this.add(row3);

	}
	
	public void controller(ActionListener ctr){
		startButton.addActionListener(ctr);
		startButton.setActionCommand("START");
	}
	
	public int number(){
		return Integer.parseInt(sizeLabel.getText());
	}
	
	public void writeAtTheEnd1(Double v) {
		pi1.setText(v.toString());
	}

	public void writeAtTheEnd2(Double v) {
		pi2.setText(v.toString());
	}

	public void clear1(){
		pi1.setText("");
//		area1.setText("");
	}
	
	public void clear2(){
		pi2.setText("");
	//	area2.setText("");
	}
	

	public void progress1(int p){
		progress1.setValue(p);
	}
	
	public void progress2(int p){
		progress2.setValue(p);
	}

}
