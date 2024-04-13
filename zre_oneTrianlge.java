// 1
// 01
// 101
// 0101


import java.util.*;
public class zre_oneTrianlge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangle(n);
    }
    public static void triangle(int n) {
        // int count =1 ;
        for(int i=0 ; i< n ; i++){
            for(int j =0 ; j <= i ; j++){
                if((i+j)%2 ==0 ){
                    System.out.print("1");

                }else{
                    System.out.print("0");
                }
                
                
            }
            System.out.println();
            
        }
        
    }
    
}

    

