
package maraton;

import java.util.Scanner;

public class punto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] array = new int [n];
        int temp;
        boolean verificador = true;
        int cont=1;
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        while(verificador == true){
            verificador = false;
            for (int i = 1; i < n; i++) {
                if (array[i]>array[i-1]) {
                    temp= array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    verificador = true;
                }
            }
        }
        
        for (int i = 1; i < n; i++) {
            if (array[i] == array[0]) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}
