import javax.swing.JOptionPane;
//exibir tabuada 1 a 10

public class Ex09 {
    public static void main(String[] args) throws Exception {
        int i = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int resultado;
        while(i<=10){
            resultado = num*i;
            i=i+1;
            System.out.println(resultado);
        }
    }
}