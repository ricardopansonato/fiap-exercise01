import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		Integer totalEmployees = Integer.valueOf(JOptionPane.showInputDialog("Total de funcion�rios: "));
		Double[] salaries = new Double[totalEmployees];
		for (int i = 0; i < totalEmployees; i++) {
			salaries[i] = Double.valueOf(JOptionPane.showInputDialog("Sal�rio funcion�rio[" + i + "]:"));
		}
		
		Double avg = 0d;
		for (int j = 0; j < totalEmployees; j++) {
			avg += salaries[j];
		}

		JOptionPane.showOptionDialog(null, "M�dia salarial: " + avg / totalEmployees, "Total",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
	}
}
