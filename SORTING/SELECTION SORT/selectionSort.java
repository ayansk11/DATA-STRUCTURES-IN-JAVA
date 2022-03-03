import java.util.Scanner;

public class selectionSort {

    int[] arr = new int[10];

    public selectionSort() {

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
        
        System.out.println("PRINTING THE SORTED ARRAY..........");
        for (int i = 0; i <= arr.length - 1; i++) {

            System.out.print(arr[i] + "\t");
        }
    }
    
    void sort(int[] arr) {

        int min;

        for (int i = 0; i < arr.length - 1; i++) {

            min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {

                    min = j;
                }
            }
        
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
    }
   
}

    
    public static void main(String[] args) {
        selectionSort sc = new selectionSort();
    }
}
