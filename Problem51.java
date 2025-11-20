import java.util.*;
public class Problem51 {
    public static void main(String[] args) {
    int [] sizes = {16, 64, 256, 1024, 4096, 16384};
    Random rand = new Random();
    SearchSortAlgorithms<Integer> searchAlgo = new SearchSortAlgorithms<>();
    System.out.printf( "%-10s %-10s %-10s %-20s %-20s\n",  "Size", "BinIndex", "SeqIndex", "Binary Comparisons", "Sequential Comparisons" );
    for (int size : sizes) {
        Integer[] list = new Integer[size];
        for (int i = 0; i<size; i++){ list [i] = rand.nextInt(size * 2);}
        Integer target = list[rand.nextInt(size)];
        searchAlgo.quickSort(list, size);
        int binIndex = searchAlgo.binarySearch(list,  0, size, target);
        int binCount = searchAlgo.noOfComparisons();

        int seqIndex = searchAlgo.seqSearch(list,  0, size, target);
        int seqCount = searchAlgo.noOfComparisons();
        System.out.printf( "%-10d %-10d %-10d %-20d %-20d\n", size, binIndex, seqIndex, binCount, seqCount );
    }
}
}

    /*public static Scanner console = new Scanner(System.in);

    final static int SIZE = 1000;

    public static void main(String[] args)
    {
        Integer[] intList = new Integer[SIZE];

        SearchSortAlgorithms<Integer> intSearchObject
                            = new SearchSortAlgorithms<Integer>();

    
		//Dr. Yu
	
	}

*/