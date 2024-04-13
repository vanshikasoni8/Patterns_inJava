// ******
// *    *
// *    *
// *    *
// *    *
// ******
import java.util.*;
public class hollow_square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hollow(n);

    }
    public static void hollow(int n){
        for(int i =0 ; i < n ;i++){
            for(int j = 0 ;  j < n ; j++){
                if(i==0 || j ==0 || i == n-1 || j== n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
    
}
