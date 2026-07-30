import java.util.*;
public class Intersectionoptimal {
    public List<Integer> FindIntersection(int arr1[],int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;
        List<Integer> l=new ArrayList<Integer>();
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                i++;

            }
            if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                l.add(arr1[i]);
                i++;
                j++;
            }
        }
        return l;
    }
    public static void main(String[] args){
        int arr1[]={1,2,2,3,3,4,5,8,9};
        int arr2[]={1,2,3,3,4,5,6,7};
        Intersectionoptimal res=new Intersectionoptimal();
        List<Integer>p=res.FindIntersection(arr1, arr2);
        for(int num:p){
            System.out.print(num+" ");
        }
    }
    
}
