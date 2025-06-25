// next greater element
import java.util.*;
public class Stacks6 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = new int[arr.length];

        //Time Complexity = O(n^2)
        // for(int i =0; i<arr.length;i++){
        //     res[i] =-1;
        //     for(int j =i+1;j<arr.length;j++){
        //         if(arr[j]>arr[i]){
        //             res[i] = arr[j];
        //             break;
        //         }
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] +" ");
        // }
        // System.out.println();
        // for(int i=0;i<res.length;i++){
        //     System.out.print(res[i] +" ");
        // }

        //Time Complexity = O(n)
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        st.push(arr[n-1]);
        res[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0  && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] +" ");
        }
    }
    
}
