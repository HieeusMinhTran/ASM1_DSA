public class BubbleSortALU {
    // Thuật toán sắp xếp nổi boọt
    // Đối tượng thao tác là Array
    public static void bubbleSort(int[] arr, int n){

        // arr : mảng chứa các số nguyên ngẫu nhiên
        //n : kích thước của mảng
        int i, j, temp;
        boolean swapped; // dấu hiệu nhận biến đã sắp xếp các cặp số
        for( i = 0; i < n - 1; i++) {
            swapped=false;
            for( j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            // nếu ko có 2 phần tử thì sẽ rơi vào vòng lặp vô hạn
            // cần kiểm tra để tránh điều đó xảy ra
            if(swapped==false){
                break;
            }
        }


    }

    public static void printResult(int[] array){
        System.out.println("Mảng sau khi đã được sắp xếp theo thuật toán Bubble Sort");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
