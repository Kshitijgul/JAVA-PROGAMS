package JAVA_Programs.Recursion;

import java.util.Scanner;

public class rec_07_Strings {
    public static String reverseString(String str) {
        // Base case: If the string is empty or has only one character
        if (str.isEmpty()) {
            return str;
        }

        // Recursive case: Reverse the rest of the string and add the first character to the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static String RemoveA(String s , int idx){
        if(s.length() == idx) return " ";
        String smallAns = RemoveA(s,idx + 1);
        char currChar = s.charAt(idx);

        if(currChar != 'a'){
            return currChar + smallAns;
        }else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        System.out.println(RemoveA(str,0));

        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
//
//        sc.nextLine();

//        String str1 = sc.nextLine();
//        System.out.println(str1);

//        char ch = str.charAt(0);
//        System.out.println(ch);
//
//        for(int i=0;i<str.length();i++){
//            System.out.print(str.charAt(i) + " ");
//        }
//        System.out.println();
//        System.out.println(str.substring(2,6));
    }
}
