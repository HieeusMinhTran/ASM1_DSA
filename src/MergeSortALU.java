public class MergeSortALU {
    private static void mergeSort(int[] arr, int l, int m, int r){
        // l: left ; m : middle ; r : right
        // Cần tìm kích thước ccuar 2 mảng con ban đầu được tách
        int n1 = m - l + 1;
        int n2 = r - m;
        // Mảng con thứ nhất : arr[1...m]
        // Mảng con thứ hai : arr[m+1...r]
        // Tạo các mảng con bên trái và bên phải
        // Khai báo mảng rộng với kích thước cố định sẵn
        int[] Left = new int[n1];
        int[] Right = new int[n2];
        // copy dữ liệu vào 2 mảng con trái phải vừa tạo
        for (int i = 0; i < n1; i++){
            Left[i] = arr[l+i];
        }
        for (int j = 0; j < n2; j++){
            Right[j] = arr[m+1+j];
        }


        int i = 0, j =0;
        int k = l;
        while (i <= n1 && j < n2){
            if(Left[i] <= Right[j]){
                arr[k] = Left[i];
                i++;

            }else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = Right[j];
            j++;
            k++;
        }


    }
    public static void sort(int[] arr, int l, int r){
        if(l < r){
            int m = l + ( r - l ) / 2;
           // để quy lại - gọi chính hàm đó trong hàm
            MergeSortALU.sort(arr, l, m);
            MergeSortALU.sort(arr, m+1, r);

            //Gọi hàm Merge đã viết
            MergeSortALU.mergeSort(arr, l, m, r);
        }
    }

    public static void printResult(int[] arr){
        System.out.println("Mảng sau khi được sắp xếp với thuật toán MergeSort");
        for (int i : arr){
            System.out.println(i);
        }
    }
}
