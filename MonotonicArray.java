public class MonotonicArray{
    public static boolean isMonotonic(int[] nums) {
        boolean increasing=true;
        boolean decreasing=true;
        for(int i=0;i<nums.length-1;i++){
            
                if(nums[i]>nums[i+1]){
                   increasing=false ;

                }
                if(nums[i]<nums[i+1]){
                    decreasing=false;
                }
            }
                    
            return increasing || decreasing;
                    
                
            
     }
    public static void main(String[]args){
        int num[]={12,3,2,1};
        boolean a=isMonotonic(num);
        System.out.print("The array is Monotonic? "+a);
    }
}