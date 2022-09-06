package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class G4Trinnskatt {

	public static void main(String[] args) {
		
		String bruttoTxt = showInputDialog("skriv inn brutto");
		int brutto= parseInt(bruttoTxt);
		double skatteProsent = 0.0;
		if((brutto>=190350) && (brutto<=267899)){
			skatteProsent= 1.7;
			
		}else if((brutto>=267900) && (brutto<=643799)){
			skatteProsent= 4.0;
		
		}else if((brutto>=643800) && (brutto<=969199)){
			skatteProsent= 13.4;
		
		}else if((brutto>=969200) && (brutto<=1999999)){
			skatteProsent= 16.4;
		
		}else if(brutto>=2000000) {
			skatteProsent= 17.4;
		
		}
		double skatt = ((brutto/100)* skatteProsent);
		double utbetalt = brutto - skatt;
		
		showMessageDialog(null, "du må betale" + skatt + "kr i skatt, og du får" + utbetalt);

	}
	
}
