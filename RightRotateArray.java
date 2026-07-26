public class RightRotateArray{
    
    private static void reverse(int nums[],int start,int end){
        
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }
    private static void rotateR(int nums[],int k){

        int n=nums.length;
        k=k%n;
        reverse(nums, 0, n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
        
    }

    public static void main(String[]args){
        int nums[]={12,3,5,7,89,6};
        rotateR(nums,2);
        for(int arr:nums){
            System.out.print(arr+" ");
        }



    }
}