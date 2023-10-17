public class SelectionSortALU {

    public static void selectionSort(int[] arr){
        int count = arr.length;
        for (int i = 0; i < arr.length; i++){
            // Thuật toán này mấu chốt là phải tìm đc min or max
            int minIdx = i;
            for (int j = i+1; j< count; j++){
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                    // tìm đc phần tử nhỏ nhất
                }
            }
            // hoán đổi vị trí giữa các cặp số
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

        }
    }

    public static void printResult(int[] arr){
        System.out.println("Mảng sau khi được sắp xếp với thuật tuấn Selection Sort");
        for (int i : arr){
            System.out.println(i);
        }
    }
}
