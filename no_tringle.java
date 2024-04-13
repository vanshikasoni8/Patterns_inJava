//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

import java.util.*;
public class no_tringle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tringle(n);
        
    }
    public static void tringle(int n ){
        int space =n-1 ;
        int str =1 ;
        for(int i = 1 ; i<= n; i++){
            for(int j =0 ; j<space; j++ ){
                System.out.print(" ");

            }
            for(int j = 0 ; j< str ; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
            space--;
            str++;
        }
    }
    
}
