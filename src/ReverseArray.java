import java.util.Scanner;

public class ReverseArray {
    public static int[] reverseArray(int arr[]){
        int c=0;
        int f=arr.length-1;
        while (c<f){
            int temp=arr[c];
            arr[c]=arr[f];
            arr[f]=temp;
            c++;
            f--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=reverseArray(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
}