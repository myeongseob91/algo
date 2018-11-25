public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {10,5,4,3,2,9,8,7,6,1};
        int temp = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] > arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //select sort version 1
    }
}
