import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class ElementRemoval {
    static int remove(Integer arr[], int n){
        Arrays.sort(arr, Collections.reverseOrder());
        int cost=0;
        for(int i=0;i<n;i++){
            cost+=arr[i]*(i+1);
        }
        return cost;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(remove(arr, n));
    }
}
