public class SelectionSort {
    public static void main(String[] args){
        int [] arr = {10,4,5,6,9,8,7,1,2,3};

        int cursor=0;
        int temp = 0;
        int index = 0;

        for (int i = 0; i < arr.length ; i++) {
            cursor = arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                if(cursor > arr[j]) {
                    cursor = arr[j];
                    index = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
