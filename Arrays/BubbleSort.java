public class BubbleSort {
    public static void main(String[]args){
        int [] arr = {60,50,30,20,10,40};
        bubbleSort(arr);
    }

    static void bubbleSort(int[]arr){
        int i,j;
        for(i=0; i<arr.length; i++){
            for(j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
