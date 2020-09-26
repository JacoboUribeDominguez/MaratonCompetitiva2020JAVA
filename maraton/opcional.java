
package maraton;

import java.util.Scanner;


public class opcional {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean verificador = true;
        int [] array = new int [n];
        int contadorPares = 0;
        int contadorImpares = 0;
        
        //llena vector y define el tamaño de pares e impares
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if(array[i] %2 == 0){
                contadorPares++;
            }else{
                contadorImpares++;
            }
        }
        //crea pares e impares
        int [] pares = new int [contadorPares];
        int [] impares = new int [contadorImpares];
        
        //llena pares e impares
        int cont = 0;
        int cont2 = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0){
                pares[cont] = array[i];
                cont++;
            }else{
                impares[cont2] = array[i];
                cont2++;
            }
        }
        //ordenador
            //pares
        int temp;
        while(verificador == true){
            verificador = false;
            for (int i = 1; i < contadorPares; i++) {
                if (pares[i]<pares[i-1]) {
                    temp = pares[i];
                    pares[i] = pares[i-1];
                    pares[i-1] = temp;
                    verificador = true;
                }
            }
        }
            //impares
        verificador = true;
        while(verificador == true){
            verificador = false;
            for (int i = 1; i < contadorImpares; i++) {
                if (impares[i]>impares[i-1]) {
                    temp = impares[i];
                    impares[i] = impares[i-1];
                    impares[i-1] = temp;
                    verificador = true;
                }
            }
        }
        
        //impresion
        
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }
        
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}
