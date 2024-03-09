public class BusquedaBinaria {
    int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;


            if (arr[m] == x)
                return m;

            if (arr[m] < x)
                l = m + 1;

            else
                r = m - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        BusquedaBinaria bs = new BusquedaBinaria();
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = bs.binarySearch(arr, x);
        if (result == -1)
            System.out.println("El elemento no está presente en el array");
        else
            System.out.println("El elemento se encontró en el índice " + result);
    }
}
