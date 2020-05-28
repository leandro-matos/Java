import javax.swing.JOptionPane;
class Exercicio5{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ").toUpperCase();
float trabLab = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho de Laboratorio: "));
float avaFin = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da avaliacao final: "));
float ExaFin = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do exame final: "));

float media = ((trabLab * 2) + (avaFin * 3) + (ExaFin * 5)) / 10;

if (media < 5){
	System.out.printf("%s, Conceito E", nome);
} else {
	if (media < 6){
		System.out.printf("%s, Conceito D", nome);
	} else if (media < 7) {
		System.out.printf("%s, Conceito C", nome);
	} else if (media < 8) {
		System.out.printf("%s, Conceito B", nome);
	} else {
		System.out.printf("%s, Conceito A", nome);
	}
}
}
}