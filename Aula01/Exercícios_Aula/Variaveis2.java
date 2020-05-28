import javax.swing.JOptionPane;

class Variaveis2{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Digite o nome:");

//Classe Wrapper => classe de apoio para os tipos primitivos
int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));

float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));

System.out.println("\n\nResultado: ");
System.out.println("Aluno..: " + nome);
System.out.println("Idade..: " + idade + " anos");
System.out.println("Altura.: " + altura + " metros"); 
System.out.printf("Peso...: %.2f quilos", peso);
float imc = peso / (altura * altura);
System.out.printf("\nO seu IMC eh: %.2f", imc);

}

}