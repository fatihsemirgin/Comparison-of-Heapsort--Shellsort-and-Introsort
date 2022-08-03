
public class SortingClass {
	public void heapSort(int[] arrayToSort) {
		HeapSort heapsort = new HeapSort();
		heapsort.sort(arrayToSort);
	}

	public int[] IntroSort(int[] arrayToSort) {
		IntroSort introsort = new IntroSort(arrayToSort.length);
		for (int i = 0; i < arrayToSort.length; i++) {
			introsort.dataAppend(arrayToSort[i]);
		}
		introsort.sortData();
		arrayToSort=introsort.getA();
		//introsort.printData();
		return arrayToSort;
		
	}

	public void ShellSort(int[] arrayToSort) {
		ShellSort shellsort = new ShellSort();
		shellsort.sort(arrayToSort);
	}
}
