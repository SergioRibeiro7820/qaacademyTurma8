/*public class Ex09 {

    public static void main(String[] args) throws Exception{
        int i = 0;
        while(i<10){
            i=i+1;
            System.out.println(i);
        }
    }
    
}*/
import javax.swing.JOptionPane;


public class Ex09 {

    public static void main(String[] args) throws Exception{

        int i = 1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 10")); //caixa dialogo para usuario inserir um numero ou palavra
        int resultado = 0; //int resultado; tbm da certo


        while(i<=10){
            
            resultado = num*i;
            System.out.println(resultado); //essa linha coloca por último ou entre as instruções seguintes.
            i=i+1;
        }
    }
}