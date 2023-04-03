//Dividing the string in equal parts 

public class Program113 {

    public static void equalParts(String s, int n){
        int len = s.length();
        // int part_size;
        // if(len % n != 0){
        //     System.out.println("The string cannot be divisible");
        // }else {
        //     part_size = len / n;
        //     for(int i=0; i<len; i++){
        //         if( i % part_size == 0){
        //             System.out.println();
        //         }
        //         System.out.print(s.charAt(i));   
        //     }
        // }
        
        if(s.length() % n != 0){
            System.out.println("This string cannot be converted into equal parts.");
        }else {
            int part_size = s.length()/n;
            String [] str = new String[5];
            int temp=0;
            for(int i=0; i<s.length(); i=i+part_size){
                str[temp] = s.substring(i, i+part_size);
                temp++;
            }
            
            for(String ss : str){
            System.out.println(ss);
        }
        }
    } 
    public static void main(String[]args){
        String s = "abcdefghijklmnopqrstuvwxy";
        equalParts(s, 5);
    }    
}
