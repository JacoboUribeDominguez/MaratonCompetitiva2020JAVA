
package maraton;

import java.util.Scanner;

public class codigoMor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] morse = {".--", "-.-", "--.", "-..", ".-.", "..-", "...", "---"};
        int cont = 0;
        
        for (int i = 0; i < t; i++) {
            String grupo;
            String clave = sc.next();
            String[] decode = new String[clave.length() / 3];

            for (int j = 0; j < decode.length; j++) {
                grupo = clave.substring(cont, cont+3);
                decode[j] = grupo;
                for (int k = 0; k < morse.length; k++) {
                    if (decode[j].equals(morse[k])) {
                        decode[j] = alfabeto[k];
                    }
                }
                cont+= 3;
                System.out.print(decode[j]);
            }
            System.out.println("");
            cont = 0;
        }
    }
}
