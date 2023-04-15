public class metodos {
    public static String dog(){
        String text1 = "Pandora late muito alto!";
        return text1;
    }
//criar um método com retorno que monte uma frase com os valores que recebeu por parâmetro

/*public static String frase(String Vamos, String comer, String feijoada, String hoje){
    String resultado = "Vamos " + "comer " + "feijoada " + "hoje";
    return resultado;
}

    public static void main(String[] args){

        System.out.println(dog());
        System.out.println(frase(null, null, null, null)+ "?");
    }
}*/

public static String texto(String primeiroTexto , String segundoTexto/*parametro*/){
    String resultado = primeiroTexto + segundoTexto;
    return resultado;
}

//3-criar 1 método com retorno que some dois valores e se for maior que 100, retorne true, caso contrário, retorne false.
public static boolean maiorQueCem(int num3, int num4){
    int resultado = num3 + num4;
    if(resultado >= 100){
        return true;
    }
    else{
        return false;
    }
}

    public static void main(String[] args){
        //String primeiroTexto = "Primeiro texto leitura ";
        //String segundoTexto = "segundo texto concatena";
        int num3 = 10;
        int num4 = 81;
        int valor3 = 70;
        int valor4 = 36;
        //System.out.println(texto(primeiroTexto, segundoTexto));
        System.out.println(maiorQueCem(valor3,valor4));
        System.out.println(maiorQueCem(num3,num4));
    }
}
