import javax.swing.JOptionPane;
class Slide63{

public static void main(String args[]){

String formacao = JOptionPane.showInputDialog("Digite Tecnologo ou Bacharelado").toUpperCase();

if (formacao.equals("TECNOLOGO")){
	System.out.println("A duração é de 2 até 3 anos");
}else if (formacao.equals("BACHARELADO")){
	System.out.println("A duração é de 4 até 6 anos");
}else{
	System.out.println("Digite apenas TECNOLOGO ou BACHARELADO");
}

}

}