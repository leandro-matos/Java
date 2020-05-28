import java.util.Scanner;

class Variaveis{

public static void main(String args[]){

Scanner  teclado = new Scanner(System.in);

System.out.println("Digite o nome:");
String nome = teclado.next() + teclado.nextLine();

System.out.println("Digite a idade:");
int idade = teclado.nextInt();

System.out.println("Digite o peso:");
float peso = teclado.nextFloat();

System.out.println("Digite a altura:");
float altura = teclado.nextFloat();

System.out.println("\n\nResultado: ");
System.out.println("Aluno..: " + nome);
System.out.println("Idade..: " + idade + " anos");
System.out.println("Altura.: " + altura + " metros"); 
//System.out.println("Peso...: " + peso + " quilos");
System.out.printf("Peso...: %.2f quilos", peso);

float imc = peso / (altura * altura);
System.out.printf("\nO seu IMC eh: %.2f", imc);

}

}