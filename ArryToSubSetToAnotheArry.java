
import java.util.*;
public class ArryToSubSetToAnotheArry {
  static boolean isSubset(int arr1[], int m, int arr2[], int n) {
    if (m > n) return false;
    for (int i = 0; i < m; i++) {
      boolean present = false;
      for (int j = 0; j < n; j++) {
        if (arr2[j] == arr1[i]) {
          present = true;
          break;
        }
      }
      if (present == false) return false;
    }
    return true;
  }
  public static void main(String[] args) {

    int arr1[]={1,7,4,5,2}; // 5
	int arr2[]={2,4,3,1,7,5,15}; // 7

    int m = arr1.length;
    int n = arr2.length;

    boolean ans = isSubset(arr1, m, arr2, n);

    if (ans == true)
      System.out.print("arr1[] is a subset of arr2[]");
    else System.out.print("arr1[] is not a subset of arr2[]");

  }
}
    

