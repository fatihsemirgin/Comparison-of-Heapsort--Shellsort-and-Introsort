import java.util.Random;

public class Main {
	static void ýnteger_types(int[] arrayToSort, int[] arrayToSort2, int[] arrayToSort3, boolean flag, boolean flag2,
			boolean flag3, int choosen) {
		for (int i = 0; i < 100000; i++) {
			if (choosen == 1) { // INC
				if (i < 1000 && flag)
					arrayToSort[i] = i;
				if (i < 10000 && flag2)
					arrayToSort2[i] = i;
				if (i < 100000 && flag3)
					arrayToSort3[i] = i;
			} else if (choosen == 2) { // DEC
				if (i < 1000 && flag)
					arrayToSort[i] = 100000 - i - 1;
				if (i < 10000 && flag2)
					arrayToSort2[i] = 100000 - i - 1;
				if (i < 100000 && flag3)
					arrayToSort3[i] = 100000 - i - 1;
			} else if (choosen == 3) { // EQUAL
				if (i < 1000 && flag)
					arrayToSort[i] = 1;
				if (i < 10000 && flag2)
					arrayToSort2[i] = 1;
				if (i < 100000 && flag3)
					arrayToSort3[i] = 1;
			}
		}
	}

	public static void main(String[] args) {
		int[] arrayToSort = new int[1000];
		int[] arrayToSort2 = new int[10000];
		int[] arrayToSort3 = new int[100000];
		int[] temp = new int[1000];
		int[] temp2 = new int[10000];
		int[] temp3 = new int[100000];
		int[] temp1 = new int[1000];
		int[] temp2_2 = new int[10000];
		int[] temp3_3 = new int[100000];
		SortingClass sort = new SortingClass();
		boolean flag = true;
		boolean flag2 = true;
		boolean flag3 = true;
		// INCREASING
//		System.out.println("INCREASING CASE");
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, flag, flag2, flag3, 1); 		  // MUST BE OPEN
		// 1000
//		long startTime = System.nanoTime();
//		sort.heapSort(arrayToSort); // run one of the sorting methods
//		long estimatedTime = System.nanoTime() - startTime;
//		System.out.println("Heap time for 1K:    "+estimatedTime);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, flag, !flag2, !flag3, 1);
//		long startTime1 = System.nanoTime();
//		sort.ShellSort(arrayToSort); // run one of the sorting methods
//		long estimatedTime1 = System.nanoTime() - startTime1;
//		System.out.println("Shell time for 1K:   "+estimatedTime1);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, flag, !flag2, !flag3,1);
//		long startTime2 = System.nanoTime();
//		arrayToSort = sort.IntroSort(arrayToSort); // run one of the sorting methods
//		long estimatedTime2 = System.nanoTime() - startTime2;
//		System.out.println("Intro time for 1K:   "+estimatedTime2);
//
//		// 10000
//		long startTime3 = System.nanoTime();
//		sort.heapSort(arrayToSort2); // run one of the sorting methods
//		long estimatedTime3 = System.nanoTime() - startTime3;
//		System.out.println("Heap time for 10K:   "+estimatedTime3);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, flag2, !flag3, 1);
//		long startTime4 = System.nanoTime();
//		sort.ShellSort(arrayToSort2); // run one of the sorting methods
//		long estimatedTime4 = System.nanoTime() - startTime4;
//		System.out.println("Shell time for 10K:  "+estimatedTime4);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, flag2, !flag3, 1);
//		long startTime5 = System.nanoTime();
//		arrayToSort2 = sort.IntroSort(arrayToSort2); // run one of the sorting methods
//		long estimatedTime5 = System.nanoTime() - startTime5;
//		System.out.println("Intro time for 10K:  "+estimatedTime5);
//
//		/// 100000
//		long startTime6 = System.nanoTime();
//		sort.heapSort(arrayToSort3); // run one of the sorting methods
//		long estimatedTime6 = System.nanoTime() - startTime6;
//		System.out.println("Heap time for 100K:  "+estimatedTime6);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, !flag2, flag3, 1);
//		long startTime7 = System.nanoTime();
//		sort.ShellSort(arrayToSort3); // run one of the sorting methods
//		long estimatedTime7 = System.nanoTime() - startTime7;
//		System.out.println("Shell time for 100K: "+estimatedTime7);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, !flag2, flag3, 1);
//		long startTime8 = System.nanoTime();
//		arrayToSort3 = sort.IntroSort(arrayToSort3); // run one of the sorting methods
//		long estimatedTime8 = System.nanoTime() - startTime8;
//		System.out.println("Intro time for 100K: "+estimatedTime8);

		//// DECREASING
//		System.out.println("DECREASING CASE");
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, flag, flag2, flag3, 2);  // MUST BE OPEN
		// 1000
//		long startTime = System.nanoTime();
//		sort.heapSort(arrayToSort); // run one of the sorting methods
//		long estimatedTime = System.nanoTime() - startTime;
//		System.out.println("Heap Time  1k:   "+estimatedTime);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, flag, !flag2, !flag3,2);
//		long startTime1 = System.nanoTime();
//		sort.ShellSort(arrayToSort); // run one of the sorting methods
//		long estimatedTime1 = System.nanoTime() - startTime1;
//		System.out.println("Shell time 1k:   "+estimatedTime1);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, flag, !flag2, !flag3,2);
//		long startTime2 = System.nanoTime();
//		arrayToSort=sort.IntroSort(arrayToSort); // run one of the sorting methods // run one of the sorting methods
//		long estimatedTime2 = System.nanoTime() - startTime2;
//		System.out.println("Intro time 1k:   "+estimatedTime2);
		
		/// 10000
//		long startTime3 = System.nanoTime();
//		sort.heapSort(arrayToSort2); // run one of the sorting methods
//		long estimatedTime3 = System.nanoTime() - startTime3;
//		System.out.println("Heap Time  10k:  "+estimatedTime3);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, flag2, !flag3,2);
//		long startTime4 = System.nanoTime();
//		sort.ShellSort(arrayToSort2); // run one of the sorting methods
//		long estimatedTime4 = System.nanoTime() - startTime4;
//		System.out.println("Shell time 10k:  "+estimatedTime4);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, flag2, !flag3,2);
//		long startTime5 = System.nanoTime();
//		arrayToSort2=sort.IntroSort(arrayToSort2); // run one of the sorting methods
//		long estimatedTime5 = System.nanoTime() - startTime5;
//		System.out.println("Intro time 10k:  "+estimatedTime5);

		/// 100000
//		long startTime6 = System.nanoTime();
//		sort.heapSort(arrayToSort3); // run one of the sorting methods
//		long estimatedTime6 = System.nanoTime() - startTime6;
//		System.out.println("Heap Time  100k: "+estimatedTime6);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, !flag2, flag3,2);
//		long startTime7 = System.nanoTime();
//		sort.ShellSort(arrayToSort3); // run one of the sorting methods
//		long estimatedTime7 = System.nanoTime() - startTime7;
//		System.out.println("Shell time 100k: "+estimatedTime7);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, !flag2, flag3,2);
//		long startTime8 = System.nanoTime();	
//		arrayToSort3=sort.IntroSort(arrayToSort3); // run one of the sorting methods
//		long estimatedTime8 = System.nanoTime() - startTime8;
//		System.out.println("Intro time 100k: "+estimatedTime8);

		// RANDOM
		Random rand = new Random();
		for (int i = 0; i < 100000; i++) {
			int rand_int1 = rand.nextInt(1000);
			if (i < 1000 && flag) {
				arrayToSort[i] = rand_int1;
				temp[i]= rand_int1;
				temp1[i]= rand_int1;
			}		
			if (i < 10000 && flag2) {
				arrayToSort2[i] = rand_int1;
				temp2[i]= rand_int1;
				temp2_2[i]= rand_int1;
			}			
			if (i < 100000 && flag3) {
				arrayToSort3[i] = rand_int1;
				temp3[i]= rand_int1;
				temp3_3[i]= rand_int1;
			}				
		}
//		// 1000
		System.out.println("RANDOM CASE");
//		long startTime = System.nanoTime();
//		sort.heapSort(arrayToSort); // run one of the sorting methods
//		long estimatedTime = System.nanoTime() - startTime;
//		System.out.println("Heap time  1k:   "+estimatedTime);
//		long startTime1 = System.nanoTime();
//		sort.ShellSort(temp); // run one of the sorting methods
//		long estimatedTime1 = System.nanoTime() - startTime1;
//		System.out.println("Shell time 1k:   "+estimatedTime1);
//		long startTime2 = System.nanoTime();
//		temp1 = sort.IntroSort(temp1); // run one of the sorting methods // run one of the sorting methods
//		long estimatedTime2 = System.nanoTime() - startTime2;
//		System.out.println("Intro time 1k:   "+estimatedTime2);

		/// 10000
		long startTime3 = System.nanoTime();
		sort.heapSort(arrayToSort2); // run one of the sorting methods
		long estimatedTime3 = System.nanoTime() - startTime3;
		System.out.println("Heap time  10k:  "+ estimatedTime3);
		long startTime4 = System.nanoTime();
		sort.ShellSort(temp2); // run one of the sorting methods
		long estimatedTime4 = System.nanoTime() - startTime4;
		System.out.println("Shell time 10k:  "+estimatedTime4);
		long startTime5 = System.nanoTime();
		temp2_2=sort.IntroSort(temp2_2); // run one of the sorting methods
		long estimatedTime5 = System.nanoTime() - startTime5;
		System.out.println("Intro time 10k:  "+estimatedTime5);

		/// 100000
//		long startTime6 = System.nanoTime();
//		sort.heapSort(arrayToSort3); // run one of the sorting methods
//		long estimatedTime6 = System.nanoTime() - startTime6;
//		System.out.println("Heap time  100k: "+estimatedTime6);
//		long startTime7 = System.nanoTime();
//		sort.ShellSort(temp3); // run one of the sorting methods
//		long estimatedTime7 = System.nanoTime() - startTime7;
//		System.out.println("Shell time 100k: "+estimatedTime7);
//		long startTime8 = System.nanoTime();	
//		temp3_3=sort.IntroSort(temp3_3); // run one of the sorting methods
//		long estimatedTime8 = System.nanoTime() - startTime8;
//		System.out.println("Intro time 100k: "+estimatedTime8);

		// EQUAL
//		System.out.println("EQUAL CASE");
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, flag, flag2, flag3, 3); // MUST BE OPEN
//		// 1000
//		long startTime33 = System.nanoTime();
//		sort.heapSort(arrayToSort); // run one of the sorting methods
//		long estimatedTime33 = System.nanoTime() - startTime33;
//		System.out.println("Heap time  1k:   "+estimatedTime33);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, flag, !flag2, !flag3,3);
//		long startTime1 = System.nanoTime();
//		sort.ShellSort(arrayToSort); // run one of the sorting methods
//		long estimatedTime1 = System.nanoTime() - startTime1;
//		System.out.println("Shell time 1k:   "+estimatedTime1);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, flag, !flag2, !flag3,3);
//		long startTime2 = System.nanoTime();
//		arrayToSort=sort.IntroSort(arrayToSort); // run one of the sorting methods // run one of the sorting methods
//		long estimatedTime2 = System.nanoTime() - startTime2;
//		System.out.println("Intro time 1k:   "+estimatedTime2);

		/// 10000
//		long startTime3 = System.nanoTime();
//		sort.heapSort(arrayToSort2); // run one of the sorting methods
//		long estimatedTime3 = System.nanoTime() - startTime3;
//		System.out.println("Heap time  10k:  "+estimatedTime3);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, flag2, !flag3,3);
//		long startTime4 = System.nanoTime();
//		sort.ShellSort(arrayToSort2); // run one of the sorting methods
//		long estimatedTime4 = System.nanoTime() - startTime4;
//		System.out.println("Shell time 10k:  "+estimatedTime4);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, flag2, !flag3,3);
//		long startTime5 = System.nanoTime();
//		arrayToSort2=sort.IntroSort(arrayToSort2); // run one of the sorting methods
//		long estimatedTime5 = System.nanoTime() - startTime5;
//		System.out.println("Intro time 10k:  "+estimatedTime5);

		/// 100000
//		long startTime6 = System.nanoTime();
//		sort.heapSort(arrayToSort3); // run one of the sorting methods
//		long estimatedTime6 = System.nanoTime() - startTime6;
//		System.out.println("Heap time  100k: "+estimatedTime6);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, !flag2, flag3,3);
//		long startTime7 = System.nanoTime();
//		sort.ShellSort(arrayToSort3); // run one of the sorting methods
//		long estimatedTime7 = System.nanoTime() - startTime7;
//		System.out.println("Shell time 100k: "+estimatedTime7);
//		ýnteger_types(arrayToSort, arrayToSort2, arrayToSort3, !flag, !flag2, flag3,3);
//		long startTime8 = System.nanoTime();	
//		arrayToSort3=sort.IntroSort(arrayToSort3); // run one of the sorting methods
//		long estimatedTime8 = System.nanoTime() - startTime8;
//		System.out.println("Intro time 100k: "+estimatedTime8);
		System.out.println("• The measurements above are in nanoseconds.");
	}
}
