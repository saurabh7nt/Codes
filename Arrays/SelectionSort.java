public class SelectionSort{

    public static void main(String[]args){
        int[] arr = {60,10,20,30,50,40};
        selectionSort(arr);
    }

    static void selectionSort(int [] arr){
        int i,j;
        for(i=0;i<arr.length; i++){
            int min = arr[i];
            for(j=i+1; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}