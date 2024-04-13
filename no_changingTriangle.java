// 1
// 2 3
// 4 5 6
// 7 8 9 10

import java.util.*;
public class no_changingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangle(n);
    }
    public static void triangle(int n) {
        int count =1 ;
        for(int i=0 ; i< n ; i++){
            for(int j =0 ; j <= i ; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
            
        }
        
    }
    
}
