import java.util.*;

public class friends {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int t2 = 0; t2 < t; t2++) {
            int n = sc.nextInt();
            int [][]sums = new int [2][n];
            int [][]numeros = new int [2][n];

            for (int i = 0; i < 2; i++){
                for (int j = 0; j < n; j++) {
                    numeros[i][j] = sc.nextInt();
                }
            }

            int k, sum;

            for (int i = 0; i < n; i++){
                for (int j = 0; j < 2; j++) {
                    sum = 0;
                    k = numeros[j][i] - 1;
                    while(k > 0){
                        if(numeros[j][i]%k == 0){
                            sum = sum + k;
                        }
                        k--;
                    }
                    sums[j][i] = sum;
                }
            }
            for (int i = 0; i < n; i++) {
                if(sums[0][i] == numeros[1][i] && sums[1][i] == numeros[0][i]){
                    System.out.println("Friend");
                }else{
                    System.out.println("Not friend");
                }
            }
        }
    }
}
