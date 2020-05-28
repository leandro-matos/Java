import java.util.Scanner;
class DecisaoSimples{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Aluno: ");
String aluno = teclado.next().toUpperCase();

System.out.println("Nota 1: ");
float nota1 = teclado.nextFloat();

System.out.println("Nota 2: ");
float nota2 = teclado.nextFloat();

float media = (nota1+nota2)/2;
// Tomada de Decisão simples, avalia somente o verdadeiro
if (media>=5){
	System.out.printf("Parabéns %s você foi aprovado!!!", aluno);
}

if (media<3){
	System.out.printf("%s você precisa tentar novamente! :-(", aluno);
}
// && and
// || or

if (media>=3 && media<5){
	System.out.printf("%s você terá mais uma chance no exame!", aluno);
} 

System.out.printf("\nSua média foi: %.2f\n", media);
// Não é recomendável utilizar uma série de decisões simples sobre um mesmo dado.
}
}




