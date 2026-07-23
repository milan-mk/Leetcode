public class lt3513_M {

    public static int unique_xor(int[] nums) {
        int n = nums.length;
        if (n == 1 || n==2)
            return n;

        int base=2,power=2;
        int ans;
        while(true){
             ans = (int)Math.pow(base,power);
            if(n<ans){
                break;
            }
        }
        
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = { 3, 2, 1 };

        int res = unique_xor(nums);
        System.out.println(res);
    }
}
