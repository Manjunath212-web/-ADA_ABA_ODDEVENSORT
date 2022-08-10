
import java.io.*;

class OddEvenSort{
	public static void oddEvenSort(int arr[], int n)
	{
    static int[] a;
    static int n;
		boolean isSorted = false; // Initially array is unsorted

		while (!isSorted) {
			isSorted = true;
			int temp = 0;

			// Perform Bubble sort on odd indexed element
			for (int i = 1; i <= n - 2; i = i + 2) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isSorted = false;
				}
			}

			// Perform Bubble sort on even indexed element
			for (int i = 0; i <= n - 2; i = i + 2) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isSorted = false;
				}
			}
		}

		return;
	}
	public static void main(String[] args)
	{
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the array size");
    n=in.nextInt();
    a=new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    
		oddEvenSort(a, n);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

		System.out.println(" ");
	}
}
