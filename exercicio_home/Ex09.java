import javax.swing.JOptionPane;


public class Ex09 {
    public static void main(String[] args) throws Exception {
        int i = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 10"));
        int resultado;
        while(i <=10){
            resultado = num*i;
            i = i +1;
            System.out.println(resultado);
        }
    }
}