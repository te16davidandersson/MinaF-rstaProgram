import javax.swing.*;
import java.awt.*;
import java.util.*;

public class MinaForstaProgram{
	public static void main(String[] args) {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null,"Hej" +
			"\nVälkommen till mitt hus.");
		JOptionPane.showMessageDialog(null,"070111111" +
			"\nRing inte mig pls!");
		JOptionPane.showMessageDialog(null, "Datum och tid: * \n" + Calendar.getInstance().getTime().toString());
		//kommentar

	}
}