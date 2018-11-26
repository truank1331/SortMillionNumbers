package sortmillionnumbers;
import java.util.Collection;
import java.util.Arrays;
import java.util.Random;
public class SortMillionNumbers {
    public static void main(String[] args) {
        int arr1[] = new int[10000000];
        int arr2[] = new int[10000000];
        for(int i=0;i<9999999;i++){
            arr1[i] = new Random().nextInt(10000000)-5000000;     
            arr1[i] = new Random().nextInt(10000000)-5000000;
        }
        long ta0 = System.nanoTime();
        Arrays.sort(arr1);
        long ta1 = System.nanoTime();
        long sa = ta1-ta0;
        System.out.printf("Sort() took: %.6f s.\n",(double)sa/1000000000);
        
        long tb0 = System.nanoTime();
        Arrays.parallelSort(arr2);
        long tb1 = System.nanoTime();
        long sb = tb1-tb0;
        System.out.printf("parallelSort() took: %.6f s.\n",(double)sb/1000000000);
    }
    
}
