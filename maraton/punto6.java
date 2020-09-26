
package maraton;

import java.util.Scanner;

public class punto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String cadena = sc.nextLine();
        String cadena2 = cadena;
        cadena = cadena.toLowerCase();
        
        char temp = cadena.charAt(0);
        int posicionTemp = 0;
        boolean salirse = false;
        boolean nulo = false;
        boolean repetida = true;
        
        for (int i = 0; i < cadena.length(); i++) {
            salirse = true;
            temp = cadena.charAt(i);
            posicionTemp = i;
            for (int j = 0; j < cadena.length(); j++) {
                if (j != i) {
                    if (cadena.charAt(j) == temp) {
                        salirse = false;
                        break;
                    }
                }else if(j == i && j == cadena.length()-1 ){
                    for (int k = 0; k < cadena.length()-1; k++) {
                        if (cadena.charAt(k) == cadena.charAt(j)) {
                            break;
                        }else{
                            repetida = false;
                        }
                    }
                }
            }
            if (i == (cadena.length()-1) && repetida == true){
                nulo = true;
            }
            if (salirse == true) {
                break;
            }
        }
        if (nulo == true) {
            System.out.println("NULL");
        }else{
            System.out.println(cadena2.charAt(posicionTemp));
        }
    }
}
