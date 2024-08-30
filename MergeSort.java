public class MergeSort {

    public static void conquer(int arr[], int sidx, int mid, int eidx) {
        int merged[] = new int[eidx - sidx + 1];

        int idx1 = sidx;
        int idx2 = mid + 1;
        int x = 0;
    }

    public static void divide(int arr[], int sidx, int eidx) {
        if (sidx >= eidx)
            return;
        int mid = sidx + (eidx - sidx) / 2;
        divide(arr, sidx, mid);
        divide(arr, mid + 1, eidx);

        conquer(arr, sidx, mid, eidx);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
    }

}