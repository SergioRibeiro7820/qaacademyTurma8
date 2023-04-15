import javax.swing.JOptionPane;
// 3- faça um algoritimo para ler dois valores (digitados pelo usuário), armazenar em variáveis, e exibir valores variáveis, trocados.

public class Ex_03{

    public static void main(String[] args) {

        //Exemplo 1
        String primeiroValor = JOptionPane.showInputDialog("Digite um valor");
        String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor");
        String auxiliar = "";

        auxiliar = primeiroValor;
        primeiroValor = segundoValor;
        segundoValor = auxiliar;

        System.out.println("O primeiro valor digitafo foi: "+primeiroValor);
        System.out.println("O segundo valor digitafo foi: "+segundoValor);

        //exemplo 2
        //int primeiroNumero = Integer.
    }
}