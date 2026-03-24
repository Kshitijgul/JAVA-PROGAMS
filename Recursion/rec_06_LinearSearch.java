package JAVA_Programs.Recursion;

public class rec_06_LinearSearch {
    public static boolean FindValue(int a[],int n, int target, int idx){
        if(idx >= n) return false;
        if(a[idx] == target) return true;
        return FindValue(a,n,target,idx+1);
    }
    public static void FindAllIndices(int a[],int n,int target,int idx){
        if(idx >= n){
            return;
        }
        if(a[idx] == target){
            System.out.println(idx + " ");
        }
        FindAllIndices(a,n,target,idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {8, 6 ,9,5,7,8,12,23,45,9,8};
        FindAllIndices(arr,arr.length,8,0);

//        if (FindValue(arr, arr.length, 12, 0)) {
//            System.out.println("THe Value is Present !");
//        }else{
//            System.out.println("Value is not Present Here ! ");
//        }
    }
}
