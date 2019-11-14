package UnaClasePack;

public class UnaClase {
    public static void main(String[] args) {
        String str = "Primera Clase Escrita con Formato CamelCase";
        String str1 = "",str2 = "";
        System.out.println();
        System.out.println(str);
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if (ascii <= 90) {
                str1 += str.charAt(i); //String concatenation '+=' in loop more.... UFA!!!
                str2 += " ";
            } else {
                str2 += str.charAt(i);
                str1 += " ";
            }
        }
        System.out.println(str1);
        System.out.println(str2);
    }
}