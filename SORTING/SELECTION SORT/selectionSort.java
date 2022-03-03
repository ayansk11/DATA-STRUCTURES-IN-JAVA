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

    

        System.out.println("THE ELEMENTS IN THE ARRAY ARE: ");
        for (int i = 0; i <= arr.length - 1; i++) {

            System.out.print(arr[i] + "\t");
        }
    }

    

    public static void main(String[] args) {
        selectionSort sc = new selectionSort();
    }
}
