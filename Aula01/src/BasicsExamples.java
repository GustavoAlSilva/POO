import javax.swing.JOptionPane;

public class BasicsExamples {

	public static void main(String[] args) {
		
		String personName;
		int personAge;
		
		personName = JOptionPane.showInputDialog("Type your name: ");
		
		personAge = Integer.parseInt(JOptionPane.showInputDialog("Type your age: "));
		
		if(personAge >= 18) {
			
			JOptionPane.showMessageDialog(null, "Of legal age!");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Under age!");
			
		}
		
		if(personName.equals("Gustavo") == true) {
			
			JOptionPane.showMessageDialog(null, "Hey, you are my namesake!");
			
		}
		
		for(int i = 0; i < 2; i++) {
			
			JOptionPane.showMessageDialog(null, "\nHello, World!");
			
		}
		
		int index = 0;
		
		while(index < 2) {
			
			JOptionPane.showMessageDialog(null, "\nHello, World!");
			index++;
			
		}
		
		index = 0;
		
		do {
			
			JOptionPane.showMessageDialog(null, "\nHello, World!");
			index++;
			
		}while(index<2);
		
		index = 0;
		
		switch(index) {
		
		case 1:
			JOptionPane.showMessageDialog(null, "\nHello, World! Case 1!");
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "\nHello, World! Case 2!");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "\nError!");
		}
		
	}

}
