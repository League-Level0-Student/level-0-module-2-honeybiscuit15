import javax.swing.JOptionPane;

public class VotingBooth {

public static void main(String[] args){
String years =
JOptionPane.showInputDialog("how old are you");
int age= Integer.parseInt(years);
if (age>=18) {
JOptionPane.showInputDialog(null,"who do think the next president should be");
}
else {
	JOptionPane.showMessageDialog(null,"nobody cares about your opinion");
}
}
}

