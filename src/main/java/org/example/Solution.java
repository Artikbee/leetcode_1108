package org.example;

public class Solution {
    public String defangIPaddr(String address){

       char[] chars = address.toCharArray();
       String st = "";

       for (int i = 0; i <chars.length;i++){
         if (chars[i] == '.' ){
             st = st+"[.]";
         } else {
             st= st+chars[i];
         }
       }
        return st;

    }
}
