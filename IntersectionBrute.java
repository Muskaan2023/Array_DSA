import java.util.*;
public class IntersectionBrute {
    public static List<Integer>FindIntersection(int []arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[arr2.length];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j] && !visited[j]){
                    ans.add(arr1[i]);
                    visited[j]=true;
                    break;


                }
                
            }
        }
        return ans;
    }
    public static void main(String []args){
        int arr1[]={1,2,3,4,4,5,5,6,8};
        int arr2[]={2,3,3,4,4,5,5,6,8};
        System.out.println(FindIntersection(arr1,arr2));

    }
    
}
