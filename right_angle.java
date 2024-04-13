import java.util.*;

// x
// x x
// x x x
// x x x x
// x x x x x
public class right_angle{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int str = 1;
		int space = a-1;

		for(int i =0 ; i<a ; i++){
			for(int j =0 ; j<space ; j++ ){
				System.out.print("  ");
			}

			for(int j = 0; j< str; j++){
				System.out.print("x ");
			}
			str++;
			space--;
			System.out.println();

		}
		   
		
	}
    
	
}
