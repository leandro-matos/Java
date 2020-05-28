import javax.swing.JOptionPane;
class Exercicio2{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ").toUpperCase();
float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preco do produto: "));
int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo de condicao de pagamento: "));

if (codigo==1){
	System.out.printf("%s, O seu produto custou %.2f", nome, (preco - (preco * 0.10)));
} else if (codigo==2){
	System.out.printf("%s, O seu produto custou %.2f", nome, (preco - (preco * 0.05)));
} else if (codigo==3) {
    System.out.printf("%s, o seu produto custou %.2f - Nao houve descontos", nome, preco);
} else if (codigo==4) {
	System.out.printf("%s, O seu produto custou %.2f - Houve acrescimo do valor", nome, (preco + (preco * 0.10)));
} else {
    System.out.printf("%s voce escolheu uma opcao invalida!! ", nome);
}

}
}