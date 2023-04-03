import java.util.*;
public class infobell{
	
	public static void countFreq(int[] arr){
		Map<Integer,Integer> count = new HashMap<>();
	
		for(int i=0; i<arr.length; i++){
			if(count.containsKey(arr[i])){
					count.put(arr[i], count.get(arr[i])+1);
			}else{
					count.put(arr[i], 1);
			}
		}
		
		Set<Integer> frequency = count.keySet();

		for(int f : frequency){

			// System.out.println(f + " "+ count.get(f));
			if(count.get(f) % 2 == 0){
				continue;
			}else{
				System.out.println(f + " "+ count.get(f));
			}
		}
	}
	
	public static void main(String[]args){
		int[] arr = {10,20,40,40,50,30,50,20,50,20,10,20,10,20,30};
		countFreq(arr);	
	}
}