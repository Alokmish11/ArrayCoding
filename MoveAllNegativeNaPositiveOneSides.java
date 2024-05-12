
    // Java program to move all negative numbers to the 
// beginning and all positive numbers to the end with 
// constant extra space 
import java.util.*; 
public class MoveAllNegativeNaPositiveOneSides {
	public static void move(int[] arr) 
	{ 
		Arrays.sort(arr); 
	} 
	public static void main(String[] args) 
	{ 
		int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 }; 
		move(arr); 
		for (int e : arr) 
			System.out.print(e + " "); 
	} 
} 
    

