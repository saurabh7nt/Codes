//Java Program to find maximum and minimum occurring character in a string

public class MaxMinChar {
    public static void main(String[]args){
        String s = "Grass is greener on the other side";
        int[] freq = new int[s.length()];
        char[] ch = s.toCharArray();
        char minChar = s.charAt(0), maxChar = s.charAt(0);    
        int min,max;
        for(int i=0; i<ch.length; i++){
            for(int j=i+1; j<ch.length; j++){
                freq[i] = 1;
                if(ch[i]==ch[j] && ch[i] != '0'){
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }
        min = max = freq[0];

        for(int i=0;i<freq.length; i++){

             if(min > freq[i] && freq[i] != '0') {    
              min = freq[i];    
              minChar = ch[i];    
          }  

          if(max < freq[i]) {    
            max = freq[i];    
            maxChar = ch[i];    
        }    
        }
        System.out.println("Minimum occurring character: " + minChar);    
        System.out.println("Maximum occurring character: " + maxChar);
    }
}
