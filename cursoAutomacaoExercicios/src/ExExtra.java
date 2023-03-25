/*import javax.swing.JOptionPane;

public class ExExtra { //1-) Faça um algoritimo para ler três valores digitados pelo usuario e exibir.
    
    public static void main(String[] args){

        String usuario = JOptionPane.showInputDialog("Usuário");       
        String email = JOptionPane.showInputDialog("E-mail"); 
        String senha = JOptionPane.showInputDialog("Password");

        System.out.println(usuario); //sysout + tab
        System.out.println(email); //sysout + tab
        System.out.println(senha); //sysout + tab
    }
}*/

import javax.swing.JOptionPane;

public class ExExtra { //1-) Faça um algoritimo para ler três valores digitados pelo usuario e exibir.
    
    public static void main(String[] args){

        String usuario = JOptionPane.showInputDialog("Usuário");       
        String email = JOptionPane.showInputDialog("E-mail"); 
        String senha = JOptionPane.showInputDialog("Password");

        System.out.println("Exibindo variáveis do tipo String: \n usuario:"+usuario+" \n email:"+email+" \n senha:"+senha);
    }
}