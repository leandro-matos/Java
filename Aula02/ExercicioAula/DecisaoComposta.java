import java.util.Scanner;
class DecisaoComposta{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Aluno: ");
String aluno = teclado.next().toUpperCase();

System.out.println("Nota 1: ");
float nota1 = teclado.nextFloat();

System.out.println("Nota 2: ");
float nota2 = teclado.nextFloat();

float media = (nota1+nota2)/2;
// Tomada de Decisão composta, avalia verdadeiro e falso e verdadeiro se...

System.out.println("Digite o total de faltas:");
int faltas = teclado.nextInt();

if (media>=5 && faltas<20){
	System.out.printf("Parabéns %s você foi aprovado!!!", aluno);
} else if (media<3 || faltas>=20){
	System.out.printf("%s você precisa tentar novamente! :-(", aluno);
} else {
	System.out.printf("%s você terá mais uma chance no exame!", aluno);
} 

System.out.printf("\nSua média foi: %.2f\n e você teve %d falta(s)", media, faltas);

}
}




