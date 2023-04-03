//10) How to find second largest number in an integer array?

public class Program10 {

    static void secondLargest(int [] arr){
        int i,j;
        for(i=0; i<arr.length; i++){
            for(j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("2nd largest element : " + arr[arr.length-2]);
    }
    public static void main(String[]args){
        int [] arr = {10,20,301,101,1,232};
        secondLargest(arr);
    }    
}
