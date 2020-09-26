
package maraton;

import java.util.Scanner;

public class punto7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        double [] puntajes = new double[n];
        double miPuntaje = sc.nextDouble();
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            puntajes[i] = sc.nextDouble();
            sum += puntajes[i];
        }

        double promedio = sum / n;
        double resta = miPuntaje - promedio;
        System.out.println(promedio); 
        String cadenaNumero= (String.format("%.2f", resta))+"";
        cadenaNumero = cadenaNumero.replace(",", ".");
        
        if (miPuntaje > promedio) {
            System.out.println("SI "+ resta);
        }else{
            System.out.println("NO");
        }
    }
}
