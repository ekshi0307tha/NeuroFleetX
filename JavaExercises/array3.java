public class Array3 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 11, 7};
        int max = arr[0];
        for (int n : arr)
            if (n > max) max = n;
        System.out.println("Largest = " + max);
    }
}
