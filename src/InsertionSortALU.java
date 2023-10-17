public class InsertionSortALU {
    public static void InsertionSort(int[] arrNumber){
        // Số lượng phần tử trong mảng
        int count = arrNumber.length;
        for (int i=0; i<count; i++) {
            // Các phần tử được duyệt

            int key = arrNumber[i];
            // Vì i - 1 : Bắt đầu từ phần tử sau phần tử đầu tiên
            // j : vị trí của các phần tử đứng trước các phần đang được duyệt
            int j = i - 1;
            while (j >= 0 && arrNumber[j] > key) {
                // Nếu như phần đứng đằng trước các phần tử đang được duyệt mà lớn hơn thì thực hiện hoán đổi vị trí
                arrNumber[j + 1] = arrNumber[j];
                j--;

            }
            arrNumber[j+1] = key;



        }
    }


    public static void printResult(int[] arr){
        System.out.println("Mảng sau khi được sắp xếp theo thuật toán InsertionSort");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
