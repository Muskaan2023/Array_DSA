public class Arraypartition {
    private static void Arr(int nums[]){
        for(int i=0 ;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;

                }
            }

        }

       
    }
     public static int arrayPairSum(int[] nums) {
        Arr(nums);
        int answer=0;
        for(int i=0;i<nums.length;i+=2){
            answer+=nums[i];
        }
        return answer;
    }
    public static void main(String[]args){
        int arr[]={4,3,2,5,1};
        int a=arrayPairSum(arr);
        System.out.print("The maximum sum of the n integer in the array "+a);

    } 
        
}
    

