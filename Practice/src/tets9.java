public class tets9 {
    public static void main(String[] args) {
        //binary search
        int[] arr = {2, 5, 7, 9, 12, 15, 20};
        int key = 2;
        int mid = 0, lb = 0, ub = arr.length;

        while( lb < ub) {
            mid = (ub + lb) / 2;
            if (arr[mid] == key) {
                System.out.print(mid);
                return;
            } else if (arr[mid] > key) {
                ub = mid;
            } else {
                lb = mid;
            }

        }
    }
}
