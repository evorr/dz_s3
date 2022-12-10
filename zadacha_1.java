//Реализовать алгоритм сортировки слиянием


public class zadacha_1 {
    public static void main(String[] args) {
        int[] array = new int[] {5,4,29,67,-5,3};
        division(array);
        for (int item: array) {
            System.out.printf("%d ", item);
        }
    }
    public static void division(int[] arr) {
        int n = arr.length;
        if (n < 2) return;
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, n - mid);
        division(left);
        division(right);
        merge(arr, left, right);
    }
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else arr[k++] = right[j++];
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
