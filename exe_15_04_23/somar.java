public class somar {
    public static void adicao(){
        int num1 = 56;
        int num2 = 50;
        System.out.println(num1 + num2);
    }
    public static int multiplicacao(){
        int mult1 = 56;
        int mult2 = 25;
        int resultado = mult1 * mult2;
        return resultado;
    }
    public static String frase(){
        String pal1 = "Olá, povo!";
        return pal1;
    }

    public static void main(String[] args){

        adicao();
        System.out.println(multiplicacao());
        System.out.println(frase());
    }

}