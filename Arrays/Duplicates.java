package Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,3,6,1}; // -->1,3,6 repeated elements
        int aux_arr[] = new int[arr.length] ;

        for (int i= 0 ; i<arr.length ;i++)
        {
            if (aux_arr[arr[i]] != 0)
            {
                System.out.print(arr[i]+" ");
            } else {
                aux_arr[arr[i]]++;
            }

        }


    }
}
