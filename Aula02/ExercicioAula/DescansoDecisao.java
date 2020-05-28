import javax.swing.JOptionPane;
class DescansoDecisao{

public static void main(String args[]){

// Você recebe o nome e a idade da pessoa
// Deve informar se ela:
// Proibido votar <16
// É facultativo votar 16,17 e mais que 65
// É obrigado(a) votar 

String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

if (idade<16){
	System.out.printf("%s você não pode votar", nome);
}else if (idade>=18 && idade<65) {
	System.out.printf("%s você é obrigado a votar", nome);
}else{
	System.out.printf("%s votar para você é facultativo", nome);
}

}

}