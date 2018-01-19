import javax.swing.JOptionPane;

public class RollerCoaster {


public static void main(String[] args){
String height = 
	JOptionPane.	showInputDialog(null,"What height are in inches");
int inches= Integer.parseInt(height);
if (inches>48){
JOptionPane.showMessageDialog(null," You can go on the rollercoaster");
}
else {
JOptionPane.showMessageDialog(null, "go grow more first");	
}
}
}