//How To Find Array Triplets With Sum Of Two Elements Equals Third?

public class Program111 {

    public static void findTriplet(int[]arr){
        int i,j,k;

        for(i=0; i<arr.length-2; i++){
            for(j=i+1; j<arr.length-1; j++){
                for(k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] == arr[k]){
                        System.out.println(" " + arr[i] +" + "+ arr[j] +" = "+arr[k] );
                    }else if(arr[j] + arr[k] == arr[i]){
                        System.out.println(" " + arr[j] +" + "+ arr[k] +" = "+arr[i] );
                    }else if(arr[i] + arr[k]==arr[j]){
                        System.out.println(" " + arr[i] +" + "+ arr[k] +" = "+arr[j] );
                    }
                }
            }
        }
    }
    public static void main(String[]args){
        int[] arr = {21, 13, 47, 61, 34, 40, 55, 71, 87};
        findTriplet(arr);
    }
}
