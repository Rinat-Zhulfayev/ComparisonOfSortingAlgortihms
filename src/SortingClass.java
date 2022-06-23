import java.util.Random;

public class SortingClass {
	public static void HeapSort(int[] arrayToSort) {
		int size = arrayToSort.length;

		for (int i = size / 2 - 1; i >= 0; i--) {
			Heapify(arrayToSort, size, i);
		}

		for (int i = size - 1; i > 0; i--) {
			int temp = arrayToSort[0];
			arrayToSort[0] = arrayToSort[i];
			arrayToSort[i] = temp;

			Heapify(arrayToSort, i, 0);
		}
	};

	private static void Heapify(int array[], int size, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < size && array[left] > array[largest])
			largest = left;

		if (right < size && array[right] > array[largest])
			largest = right;

		if (largest != i) {
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;

			Heapify(array, size, largest);
		}
	}

	public void IntroSort(int[] arr) {
		int n = arr.length;
        int depthLimit = (int) (Math.floor(Math.log(n) / Math.log(2)) * 2);
 
        sortDataUtil(arr, 0, n-1 , depthLimit);

	}
	private void sortDataUtil(int[] arr, int begin, int end, int depthLimit)
    {
        if (end - begin > 1) {
            if (depthLimit == 0) {
            	HeapSort(arr);
                return;
            }
  
            // p is partitioning index,
            // arr[p] is now at right place
            int p = partition(arr,begin, end);
 
            // Separately sort elements before
            // partition and after partition
            sortDataUtil(arr, begin, p, depthLimit-1);
            sortDataUtil(arr, p + 1, end, depthLimit-1);
        }
 
        else {
            
        	InsertionSort(arr, begin, end);
        }
    }
	
	  private int partition(int[] a, int low, int high)
	    {	 
	        // pivot
	        int pivot = a[high];
	 
	        // Index of smaller element
	        int i = (low - 1);
	        for (int j = low; j <= high - 1; j++) {
	 
	            // If the current element is smaller
	            // than or equal to the pivot
	            if (a[j] <= pivot) {
	 
	                // increment index of smaller element
	                i++;
	                swap(a, i, j);
	            }
	        }
	        swap(a, i + 1, high);
	        return (i + 1);
	    }
	  private void swap(int[] a, int i, int j)
	    {
	        int temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	    }

	private static void InsertionSort(int[] arr, int left, int right) {
		for (int i = left; i <= right; i++) {
			int key = arr[i];
			int j = i;
			while (j > left && arr[j - 1] > key) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = key;
		}

	}

	public void ShellSort(int[] arrayToSort) {
		int size = arrayToSort.length;

		for (int gap = size / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < size; i += 1) {
				int temp = arrayToSort[i];
				int j;
				for (j = i; j >= gap && arrayToSort[j - gap] > temp; j -= gap) {
					arrayToSort[j] = arrayToSort[j - gap];
				}
				arrayToSort[j] = temp;
			}
		}
	}

}
