// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] A = {0,1, 2, 3, 8};
       int left = 0;
       int right = A.length -1 ;
       while (left<right){
           int sum = A[left]+A[right];
           if(sum==n){
               System.out.println("the two numbers are "+A[left]+" "+ A[right]);
               break;
           }
           else if(sum>n){
               right--;
           }
           else{
               left++;
           }
       }

    }
}