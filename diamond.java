import java.util.*;
public class diamond {
    public static void main(String[] args) {

        int row, i, j, space = 1;  

Scanner sc = new Scanner(System.in);  
row = sc.nextInt();  
space = row - 1;  
for (j = 1; j<= row; j++)  
{  
for (i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space--;  
for (i = 1; i <= 2 * j - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
space = 1;  
for (j = 1; j<= row - 1; j++)  
{  
for (i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space++;  
for (i = 1; i<= 2 * (row - j) - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
}  
  
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     triangle(n);
    // }
    // public static void triangle(int n){
        
    //     int space = n-1 ; 
    //     for(int i=1 ; i<= (2*n -1) ; i++){
    //         for(int j =0 ; j < space ; j++){
    //             System.out.print( " ");
    //         }
    //         for(int j =1 ; j <= i ; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //         if(i < n ){
                
    //             space--;
    //         }
    //         else{
                
    //             space++;
    //         }


    //     }
    // }
}
