package JAVA_Programs.ALL_Patterns;
//
// A
//         B C
//         D E F
//         G H I J
//         K L M N O

public class pattern_5 {
    public static void main(String[] args) {
        System.out.println();
        int n = 5;
        char ch='A';
        for (int i = 1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print(" " +ch);
                ch++;
            }
            System.out.println();

        }
    }
}
