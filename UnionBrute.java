import java.util.*;
public class UnionBrute{
    public List<Integer> findUnion(int []arr1,int []arr2){
        Set<Integer> st=new TreeSet<>();
        for(int num:arr1){
            st.add(num);
        }
        for(int num:arr2){
            st.add(num);
        }


       return new ArrayList<>(st);
    }
    public static void main(String []args){
        int arr1[]={1,2,3,5,8,6};
        int arr2[]={5,6,8,9,12};
        UnionBrute b=new UnionBrute();
        List<Integer>result=b.findUnion(arr1, arr2);
        for(int val: result){
            System.out.print(val+" " );
        }
    }

}