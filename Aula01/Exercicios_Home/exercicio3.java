import javax.swing.JOptionPane;

class exercicio3{

public static void main(String args[]){

float capital = Float.parseFloat(JOptionPane.showInputDialog(" Por favor informe o capital : "));
float taxaMensal = Float.parseFloat(JOptionPane.showInputDialog(" Digite a taxa mensal : "));
int meses = Integer.parseInt(JOptionPane.showInputDialog(" Informe o periodo em meses: "));

double montante = capital * Math.pow((1 + taxaMensal/100),meses);

System.out.printf("\n O montante eh: %.2f", montante);

}

}