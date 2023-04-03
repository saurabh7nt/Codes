// public class Program114 {

//     public static void removeDuplicate(String s){
//         char[] ch = s.toCharArray();
//         int i,j, n=ch.length, temp=0;
//         for(i=0; i<n; i++){
//             for(j=0; j<i; j++){
//                 if(ch[i]==ch[j]){
//                     break;
//                 }
//             }
//                 if(j==i){
//                     ch[temp++] = ch[i];
//                  }
//             }
//             System.out.println(java.util.Arrays.toString(ch));
//         }

//     public static void main(String[]args){
//         String s = "Saurabh";
//         removeDuplicate(s);
//     }
// }

import java.util.*;
public class Program114 {
 public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
  String str1 = "w3resource";
  System.out.println("The given string is: " + str1);
  System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
 }
 private static String removeDuplicateChars(String sourceStr) {
  char[] arr1 = sourceStr.toCharArray();
  String targetStr = "";
  for (char value: arr1) {
   if (targetStr.indexOf(value) == -1) {
    targetStr += value;
   }
  }
  return targetStr;
 }
}

