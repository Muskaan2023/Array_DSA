import java.util.*;
public class UnionBetter {
    public ArrayList<Integer> findUnion(int arr1[],int arr2[]){
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int num:arr1){
            map.put(num,1);
        }
        for(int num:arr2){
            map.put(num,1);
        }
        return new ArrayList<>(map.keySet());
        
    }
    public static void main(String []args){
        int arr1[]={1,2,3,5,8,6};
        int arr2[]={5,6,8,9,12,4};
        UnionBetter b=new UnionBetter();
        List<Integer>result=b.findUnion(arr1, arr2);
        for(int val: result){
            System.out.print(val+" " );
        }
    }
    
}
