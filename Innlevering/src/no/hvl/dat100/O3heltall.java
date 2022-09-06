package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class O3heltall {

	public static void main(String[] args) {
	
		String nTxt= showInputDialog("Skriv inn et heltall");
		int n= parseInt(nTxt);
		int svar = 1;
		
		for(int i=1; i<=n; i++) {
			svar= svar * i;
		}
			
			showMessageDialog(null, n + "!=" + svar);
			
		

	}

}
