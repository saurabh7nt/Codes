public class infobell2{
	public static void main(String[]args){
		int[] arr = {10,19,20,30,15,15,10,21,9,22,8,25,11,5};
		int num = 30;
		for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++)
            if(arr[i] + arr[j] == num){
                System.out.println(arr[i] + " + " + arr[j] + " = " + num );
            }else{
                continue;
            }
		}
	}
}