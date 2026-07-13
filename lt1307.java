import java.util.*;

public class lt1307{
    public static void main(String args[]){
        int low=234,high=2314;

        List<Integer> arr=new ArrayList<>();
        String dig = "123456789";

        String s = Integer.toString(low);
        for(int i = s.length()-1;i<=9;i++){
            for(int j=0;j<=dig.length()-i;j++){
                int n = Integer.parseInt(dig.substring(j,j+i));
                
                    
                if(n>=low && n<=high){
                    arr.add(n);
                }
            }
        }
        // for(int a:arr){

        //     System.out.println(a);
        // }
    }
}