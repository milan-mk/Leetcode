import java.util.Arrays;

public class lt1607 {

    private static int gcd(int a,int b){
        while(b!=0){
            int temp =b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static void main(String args[]){
        int[] nums = {2,6,4};
        int n = nums.length;

        int mx = 0;
        int[] prefixgcd = new int[n];

        for(int  i = 0;i<n;i++){
            mx = Math.max(mx,nums[i]);
            prefixgcd[i] = gcd(mx,nums[i]);
        }

        Arrays.sort(prefixgcd);
         long totalsum = 0;
        for(int j = 0;j<n/2;j++){
            totalsum += gcd(prefixgcd[j],prefixgcd[n-1-j]);
        }
        
        System.out.println(totalsum);
    }
}
