public class main {.
	static boolean isPossible(int arr[], int n, int m,
							int curr_min)
	{
		int studentsRequired = 1;
		int curr_sum = 0;
		for (int i = 0; i < n; i++) {
			curr_sum += arr[i];
			if (curr_sum > curr_min) {
				studentsRequired++; 
				curr_sum = arr[i];
			}
		}
		return studentsRequired <= m;
	}
	static int findPages(int arr[], int n, int m)
	{
		int sum = 0;
		if (n < m)
			return -1;
		int mx = arr[0];
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			mx = (arr[i] > mx ? arr[i] : mx);
		}
		int start = arr[n - 1], end = sum;
		int result = Integer.MAX_VALUE;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (isPossible(arr, n, m, mid)) {
				result = mid;
				end = mid - 1;
			}
			else
				start = mid + 1;
		}
		return result;
	}
	public static void main(String[] args)
	{
		int arr[] = { 12, 34, 67,90 }; 
		int m = 2;
		System.out.println("Minimum number of pages = "
						+ findPages(arr, arr.length, m));
	}
}