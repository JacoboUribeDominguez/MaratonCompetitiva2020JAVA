/*

*******************************************
public class Maraton {

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
Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] array = new int [n];
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int max = array[0];
        int cont=1;
        
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
                cont = 1;
            }else if(array[i] == max){
                cont++;
            }
        }
        System.out.println(cont);

punto 4
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

punto 6
    
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

punto 7

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
 */
