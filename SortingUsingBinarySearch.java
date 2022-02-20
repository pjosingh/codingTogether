import java.time.Instant;
import java.util.List;

public class SortingUsingBinarySearch {

    public static void main(String ar[]) {


        int [] target = new int []{6,4,2,1,6,8,9,3,2,3,4,6,8,3,2,3,4,68,9,0};

        print(target);
        // sort(target);   
        // print(target);
        long start = System.nanoTime();
        sortUsingBinarySearchTree(target);
        //sort(target);
        //print(target);
        long end = System.nanoTime();

        System.out.println("Consumed time: "+ (end-start));

        // sort
        /**
         * algorithms for sorting 
         * 
         * bubble sort, insertion sort, merge sort
         */
    }

    private static void print(int[] target) {
        for (Integer el: target) {
            System.out.print(el+" ");
        }
        System.out.println();
    }

    public static void sortUsingBinarySearchTree(int [] target) {
        BinarySearchTree tree = new BinarySearchTree();
        for (Integer el: target) {
            tree.insert(el);
        }
        List<Integer> arr = tree.buildInorderArray();
        for(Integer el: arr) {
            System.out.print(el+" ");
        }
        System.out.println();
    }



    public static void sort(int[] target) {
        for (int i=0; i<target.length; i++) {
            for (int j=i+1;j<target.length; j++) {
                if (target[i] > target[j]) {
                    int temp = target[i];
                    target[i] =target[j];
                    target[j] = temp;
                }
            }
            //print(target);

        }
    }
    
}
