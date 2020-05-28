import javax.swing.JOptionPane;

class exercicio7{

public static void main(String[] args) {

float custo = Float.parseFloat(JOptionPane.showInputDialog(" Informe o custo do espetaculo teatral: "));
float convite = Float.parseFloat(JOptionPane.showInputDialog(" Informe o preco do convite: "));

float qtdeLucro= custo / convite; 

    //Respostas
System.out.printf("\nA quantidade de ingressos a serem vendidos para cobrir o custo do espetaculo teatral eh : %.2f", qtdeLucro);

}

}