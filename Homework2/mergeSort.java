public class mergeSort {
	public static void main(String [] args){
		int[] array = new int[]{1, 6, -23, 9, 10, -7, 12, 32, 56};
		int[] array1 = new int[]{2, 4, -23, 9, 10, 78, 98, 87, 1, 3, 102};
		int[] array2 = new int[]{12, -89, 9, 10, 15, 56, 8, 6, 87, 12};
		int[] array3 = new int[]{4, 12, 25, 9, 10, 4, 1, 0, -45};
		int[] array4 = new int[]{9, 55, -89, 9};
		int[] array5 = new int[]{54, 66};
		sortArray(array);
		printArray(array);
		 System.out.print("\n");
		sortArray(array1);
		printArray(array1);
		 System.out.print("\n");
		sortArray(array2);
		printArray(array2);
		 System.out.print("\n");
		sortArray(array3);
		printArray(array3);
		 System.out.print("\n");
		sortArray(array4);
		printArray(array4);
		 System.out.print("\n");
		sortArray(array5);
		printArray(array5);
		 System.out.print("\n"); 
	}
	
	
public static void mergeSort(int[] array, int splitlow, int splithigh){ 
	if(splitlow < splithigh){
		int middle = (splitlow + splithigh) / 2;
		mergeSort(array, splitlow, middle);
		mergeSort(array, middle+1, splithigh);
		merge(array, splitlow, middle, splithigh);
	}
	else 
		return;
}
	
public static void sortArray(int[] array){
	mergeSort(array, 0, array.length - 1);
}	
public static void printArray(int [] array){
for(int i : array)
	System.out.printf("%d ", i);
}
public static void merge(int array[], int splitlow, int middle, int splithigh){
	int leftsize = middle - splitlow +1;
	int rightsize = splithigh - middle;
	
	
	int[] left  = new int[leftsize + 1];
	int[] right = new int[rightsize + 1];
	
	left[leftsize] = Integer.MAX_VALUE;
	right[rightsize] = Integer.MAX_VALUE;
	
	
	for(int i = 0; i < leftsize; i++)
		left[i] = array[splitlow +i];
	for(int i = 0; i < rightsize; i++)
		right[i] = array[i+middle+1];
	
	int temp = 0;
	int temp1 = 0;
	for(int i = splitlow; i <= splithigh; ++i){
		if(left[temp] <= right[temp1]){
			array[i] = left[temp]; 
			temp++;
		}
		else {
			array[i] = right[temp1]; 
			temp1++;
		}
	}
}
}