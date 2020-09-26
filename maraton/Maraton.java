/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Maraton {

    public static void main(String[] args) {
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
    }
}
