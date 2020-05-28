import javax.swing.JOptionPane;

class exercicio5{

public static void main(String[] args) {

int nascAno = Integer.parseInt(JOptionPane.showInputDialog(" Qual o seu ano de nascimento ?: "));
int atualAno = Integer.parseInt(JOptionPane.showInputDialog(" Qual o ano atual ?: "));

int idaAno = (atualAno - nascAno);
int idaFut = 2050 - nascAno;

    //Respostas
System.out.println("A idade da pessoa em anos eh:" + idaAno);
System.out.println("Esta pessoa em 2050 tera : " + idaFut + " anos");

}

}