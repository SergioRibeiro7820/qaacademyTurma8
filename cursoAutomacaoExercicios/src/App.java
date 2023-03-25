/*public class App {
    public static void main(String[] args) throws Exception {
            //2-) Faça um algoritmo para ler e exibir uma palavra (string)
    
            String palavra = "curso";
            System.out.println(palavra); //sysout + tab
         
    }
}
*/
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        //2-) Faça um algoritimo para ler e exibir uma palavra

        String palavraChave = JOptionPane.showInputDialog("Sabadeira");
        System.out.println(palavraChave); //sysout + tab
    }
}