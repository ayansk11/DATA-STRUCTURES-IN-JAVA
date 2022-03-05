import java.util.Scanner;

public class insertionSort {

    int[] arr = new int[10];

    public insertionSort() {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ELEMENTS IN THE ARRAY: ");

        for (int i = 0; i <= arr.length - 1; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println("THE ELEMENTS IN THE ARRAY ARE: ");
        for (int i = 0; i <= arr.length - 1; i++) {

            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");

        System.out.println("PERFORMING INSERTION SORT ON THE ARRAY........");
        sort(arr);

        System.out.println("PRINTING THE SORTED ARRAY: ");
        for (int i = 0; i <= arr.length - 1; i++) {

            System.out.print(arr[i] + "\t");
        }
    }
    
    void sort(int[] arr) {
        
    for (int i = 1; i < arr.length; i++)
    {
        int currindex = i;

        while (currindex > 0 && arr[currindex] < arr[currindex - 1])
        {
            int temp = arr[currindex];
            arr[currindex] = arr[currindex - 1];
            arr[currindex - 1] = temp;

            currindex = currindex - 1;
        }
    }
}

}


    public static void main(String[] args) {
        insertionSort sc = new insertionSort();
    }
}
