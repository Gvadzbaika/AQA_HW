package HW4;
import java.util.Arrays;
import java.util.PriorityQueue;
public class Task2 {
    public static void main(String[] args) {
        int [] numbers= new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        System.out.println("base: "+ Arrays.toString(numbers));
        upSort(numbers);
        System.out.print("asc:  ");
        System.out.println(Arrays.toString(numbers));
        downSort(numbers);
        System.out.print("desc: ");
        System.out.println(Arrays.toString(numbers));
        spiralSort(numbers);
        System.out.print("inner:");
        System.out.println(Arrays.toString(numbers));
    }
    public static void upSort(int[] items)
    {
        int stepsCount = items.length - 1;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (items[i] > items[i + 1]) {
                    int temp = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = temp;
                    swapped = true;
                }
            }
            stepsCount--;
        } while (swapped);
    }
    public static void downSort(int[] items)
    {
        int stepsCount = items.length - 1;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (items[i] < items[i + 1]) {
                    int temp = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = temp;
                    swapped = true;
                }
            }
            stepsCount--;
        } while (swapped);
    }
    public static void spiralSort(int[] arr) {
        PriorityQueue<Integer> q = new PriorityQueue<>(arr.length);
        for (int n : arr) {
            q.add(n);
        }
        for (int i = arr.length / 2 + arr.length % 2 - 1, d = 1, s = -1;
             !q.isEmpty(); i += (s *= -1) * d++)
        {
            arr[i] = q.poll();
        }
    }
}











