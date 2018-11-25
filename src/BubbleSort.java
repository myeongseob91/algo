public class BubbleSort {

    public static void arrPrint(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
    }

    public static void bubbleSort(int[] arr) {
        bubbleSort(arr, arr.length-1);
    }

    public static void bubbleSort(int[] arr , int last) {
        if(last > 0) {
            for (int i = 1; i <= last; i++) {
                if(arr[i-1] > arr[i]) {
                    swap(arr, i-1 , i);
                }
            }
            bubbleSort(arr,last-1);
        }
    }

    public static void swap(int[] arr,int source , int target){
        int temp = arr[source];
        arr[source] = arr[target];
        arr[target] = temp;
    }
    public static void main(String[] args) {

        int [] arr = {10,4,5,6,9,8,7,1,2,3};
        arrPrint(arr);
        bubbleSort(arr);
        arrPrint(arr);




       /* for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } 일단 성공.. 재귀 클린코드스럽게 짜보자*/

       /* for (int j = 0; j < arr.length;) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        } 뇌정지옴 여기서 구글링함 젠장;*/
        
        /*for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        } out of index*/

    }
}
