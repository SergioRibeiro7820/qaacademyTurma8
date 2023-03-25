import javax.swing.JOptionPane;

public class Ex03_ { // 3- Faça um algoritimo para ler dois valores (digitados pelo usuário), armazenar em variáveis, e exibir os valores das variaveis, trocados.

    public static void main(String[] args) {


        String nome = JOptionPane.showInputDialog("Digite seu nome");       
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome"); 
        String idade = JOptionPane.showInputDialog("Digite sua idade");

        String idade2 = "";
        idade2 = nome;
        nome = sobrenome;
        sobrenome = idade;
        idade = idade2;

        System.out.println(nome); //sysout + tab
        System.out.println(sobrenome); //sysout + tab
        System.out.println(idade); //sysout + tab
    }
}
    

// Exemplo 2

// int primeroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu nome"));