package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTicket {
	public static void main(String[] args) {
		String message ="";
Random max = new Random (); 	
for (int i = 0; i < 5; i++) {
int num = max.nextInt(60);
message += num; 
message += " ";
}
JOptionPane.showMessageDialog(null,message,"Lottery Ticket",JOptionPane.INFORMATION_MESSAGE);
}
}