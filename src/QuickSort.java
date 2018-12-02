public class QuickSort {
    public static void main(String[] args) {
        //int []arr = {45, 39, 98, 15, 52, 44, 33, 28, 40, 38, 77, 68, 11, 43};

        /*피봇을 정한다.
        0 + 7 / 2 = 3번째 인덱스부터.. 2를 기준으로
        i                       pivot                    j
        45, 39, 98, 15, 52, 44, 33, 28, 40, 38, 77, 68, 11, 43

            i                       j
        11, 39, 98, 15, 52, 44, 33, 28, 40, 38, 77, 68, 45, 43

                i               j
        11, 28, 98, 15, 52, 44, 33, 39, 40, 38, 77, 68, 45, 43

                     j   i   i가 j보다 커지면 j와 피봇을 바꾼다.
        11, 28, 33, 15, 52, 44, 98, 39, 40, 38, 77, 68, 45, 43

        //이렇게 하면 Pivot 인 33의 왼쪽 편에는 33보다 작거나 같은 숫자,
        //오른 편에는 33보다 크거나 같은 숫자가 위치하게 된다.

        11, 28, 15, 33, 52, 44, 98, 39, 40, 38, 77, 68, 45, 43

        ///////////////2

        5 - 3 - 7 - 6 - 2 - 1 - 4

        int []arr = {5,3,7,6,2,1,4};

        i           j pivot
        5,3,7,6,2,  1,  4

          i     j      둘다 피봇보다 작아서 자리를 바꾸지 않는다.
        1,3,7,6,2,5,4

            i   j      바꾼다.
        1,3,7,6,2,5,4

            j i         i위치가 j 위치보다 커지면, i 위치의 값과 피벗 값을 교환한다.
        1,3,2,6,7,5,4

        1,3,2,4,7,5,6

        1,3,2
        7,5,6 두 부분을 퀵정렬한다


        5 3  7   6     2 1 4
                pivot

        5 3  7   6     2 1 4
             i             j

        5 3  4   6     2 1 7
                         

        */



        int[] arr = {5,3,7,6,2,1,4};

        quickSort(arr,0,arr.length-1);
        printArray(arr);


    }

    public static void quickSort(int[] arr, int left, int right) {
        int i, j, pivot, tmp;
        if (left < right) {
            i = left;   j = right;
            pivot = arr[(left+right)/2];
            //분할 과정
            while (i < j) {
                while (arr[j] > pivot) j--;
                // 이 부분에서 arr[j-1]에 접근해서 익셉션 발생가능함.
                while (i < j && arr[i] <= pivot) i++;

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            //정렬 과정
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
