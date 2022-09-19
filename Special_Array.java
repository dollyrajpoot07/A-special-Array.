// A special Array.
// A sequence is considered as special only if there are no such pair of adjacent numbers
// int the sequence such that the pair consists of both odd and even numbers.
// Input 1: 1
// 4
// 1
// 2
// 3
// 4
// Output 1:
// Yes
// Input 2: 2
// 4
// 4
// 4
// 4
// 4
// 4
// 1
// 2
// 3
// 4
// Output: 
// No
// Yes

import java.util.*;

class Special_Array {

	static boolean CountingEvenOdd(int arr[], int arr_size) {
		int even_count = 0;
		int odd_count = 0;

		for (int i = 0; i < arr_size; i++) {
			if ((arr[i] & 1) == 1)
				odd_count++;
			else
				even_count++;
		}

		if(odd_count == even_count) {
		    return true;
		} else {
		    return false;
		}
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	    int n = sc.nextInt();
	    int[] arr = new int[n];
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < n; j++) {
			   arr[j] = sc.nextInt();
			}
			boolean ans = CountingEvenOdd(arr, n);
			if(ans == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}
}
