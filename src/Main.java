import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

	public static void reverse(int arr[]) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}

	public static void main(String[] args) {
		Random random = new Random();

		int[] equal_1k = new int[1000];
		Arrays.fill(equal_1k, 7);
		int[] equal_10k = new int[10000];
		Arrays.fill(equal_10k, 7);
		int[] equal_100k = new int[100000];
		Arrays.fill(equal_100k, 7);

		int[] random_1k = random.ints(1000).toArray();
		int[] random_10k = random.ints(10000).toArray();
		int[] random_100k = random.ints(100000).toArray();

		int[] incr_1k = IntStream.range(0, 1000).toArray();
		int[] incr_10k = IntStream.range(0, 10000).toArray();
		int[] incr_100k = IntStream.range(0, 100000).toArray();

		int[] dcr_1k = IntStream.range(0, 1000).toArray();
		reverse(dcr_1k);
		int[] dcr_10k = IntStream.range(0, 10000).toArray();
		reverse(dcr_10k);
		int[] dcr_100k = IntStream.range(0, 100000).toArray();
		reverse(dcr_100k);

		SortingClass Sort = new SortingClass();
		long startTime, estimatedTime;
		int[] temp;
/*	
		// equal 1k
		startTime = System.currentTimeMillis();
		Sort.HeapSort(equal_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for HeapSort of equal 1k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(equal_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for ShellSort of equal 1k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(equal_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of equal 1k elements: " + estimatedTime + " ms");
		System.out.println();
		
		// Equal 10k

		startTime = System.currentTimeMillis();
		Sort.HeapSort(equal_10k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for HeapSort of equal 10k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(equal_10k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for ShellSort of equal 10k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(equal_10k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of equal 10k elements: " + estimatedTime + " ms");
		System.out.println();
		
		// Equal 100k

		startTime = System.currentTimeMillis();
		Sort.HeapSort(equal_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for HeapSort of equal 100k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(equal_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for ShellSort of equal 100k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(equal_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of equal 100k elements: " + estimatedTime + " ms");
		System.out.println();
		
		// random 1k
		temp = Arrays.copyOf(random_1k, random_1k.length);

		startTime = System.currentTimeMillis();
		Sort.HeapSort(random_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		random_1k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for HeapSort of random 1k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(random_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		random_1k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for ShellSort of random 1k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(random_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of random 1k elements: " + estimatedTime + " ms");
		System.out.println();
*/
		
		// random 10k
		temp = Arrays.copyOf(random_10k, random_10k.length);

		startTime = System.currentTimeMillis();
		Sort.HeapSort(random_10k);
		estimatedTime = System.currentTimeMillis() - startTime;
		random_10k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for HeapSort of random 10k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(random_10k);
		estimatedTime = System.currentTimeMillis() - startTime;	
		random_10k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for ShellSort of random 10k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(random_10k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of random 10k elements: " + estimatedTime + " ms");
		System.out.println();

/*		
		// random 100k
		temp = Arrays.copyOf(random_100k, random_100k.length);

		startTime = System.currentTimeMillis();
		Sort.HeapSort(random_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		random_100k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for HeapSort of random 100k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(random_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		random_100k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for ShellSort of random 100k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(random_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of random 100k elements: " + estimatedTime + " ms");	
		System.out.println();
		
		// increasing 1k
		temp = Arrays.copyOf(incr_1k, incr_1k.length);

		startTime = System.currentTimeMillis();
		Sort.HeapSort(incr_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		incr_1k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for HeapSort of increasing 1k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(incr_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		incr_1k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for ShellSort of increasing 1k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(incr_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of increasing 1k elements: " + estimatedTime + " ms");
		System.out.println();
		
		// increasing 10k
		temp = Arrays.copyOf(incr_10k, incr_10k.length);

		startTime = System.currentTimeMillis();
		Sort.HeapSort(incr_10k);
		estimatedTime = System.currentTimeMillis() - startTime;
		incr_10k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for HeapSort of increasing 10k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(incr_10k);
		estimatedTime = System.currentTimeMillis() - startTime;
		incr_10k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for ShellSort of increasing 10k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(incr_10k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of increasing 10k elements: " + estimatedTime + " ms");
		System.out.println();
		
		// increasing 100k
		temp = Arrays.copyOf(incr_100k, incr_100k.length);

		startTime = System.currentTimeMillis();
		Sort.HeapSort(incr_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		incr_100k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for HeapSort of increasing 100k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(incr_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		incr_100k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for ShellSort of increasing 100k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(incr_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of increasing 100k elements: " + estimatedTime + " ms");
		System.out.println();
		// Decreasing 1k
		temp = Arrays.copyOf(dcr_1k, dcr_1k.length);

		startTime = System.currentTimeMillis();
		Sort.HeapSort(dcr_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		dcr_1k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for HeapSort of decreasing 1k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(dcr_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		dcr_1k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for ShellSort of decreasing 1k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(dcr_1k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of decreasing 1k elements: " + estimatedTime + " ms");
		System.out.println();
		

		// decreasing 10k
		temp = Arrays.copyOf(dcr_10k, dcr_10k.length);

		startTime = System.currentTimeMillis();
		Sort.HeapSort(dcr_10k);
		estimatedTime = System.currentTimeMillis() - startTime;
		dcr_10k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for HeapSort of decreasing 10k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(dcr_10k);
		estimatedTime = System.currentTimeMillis() - startTime;
		dcr_10k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for ShellSort of decreasing 10k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(dcr_10k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of decreasing 10k elements: " + estimatedTime + " ms");
		System.out.println();

		// decreasing 100k
		temp = Arrays.copyOf(dcr_100k, dcr_100k.length);

		startTime = System.currentTimeMillis();
		Sort.HeapSort(dcr_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		dcr_100k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for HeapSort of decreasing 100k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.ShellSort(dcr_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		dcr_100k = Arrays.copyOf(temp, temp.length);
		System.out.println("Estimated time for ShellSort of decreasing 100k elements: " + estimatedTime + " ms");

		startTime = System.currentTimeMillis();
		Sort.IntroSort(dcr_100k);
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Estimated time for IntroSort of decreasing 100k elements: " + estimatedTime + " ms");
*/		

	}
}
