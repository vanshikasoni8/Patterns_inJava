// 1234
// 123
// 12
// 1

import java.util.*;
public class reverse_col_noTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangle(n);
    }
    public static void triangle(int n){
        for(int i=n ; i>=1 ; i--){
            for(int j= 1 ; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    
}
