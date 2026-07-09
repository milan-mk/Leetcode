
public class lt0907 {
    public static void main(String args[]) {
        // int n = 4, maxDiff = 2;
        // int nums[] = { 2, 5, 6, 8 };
        // int queries[][] = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 3 } };
        int n = 3, maxDiff = 53406;
        int nums[] = { 40235,86209,87259 };
        int queries[][] = { {2,0},{ 1,0 }};

        int len = queries.length;
        boolean[] boollist = new boolean[len];

        for (int i = 0; i < len; i++) {
            int a = (queries[i][0]);
            int b = (queries[i][1]);
            boolean val = false;
            int p,q;
            if(a<b){
                p=a;q=b;
            }else{p=b;q=a;}
            if (Math.abs((a-b)) > 1) {
                for (int j = p; j <q; j++) {
                    val = Math.abs((nums[j+1] - nums[j])) <= maxDiff;
                    if(!val){
                        break;
                    }
                }
            } else {
                val = (Math.abs(nums[b] - nums[a])) <= maxDiff;

            }
                
                    boollist[i] = val;
               
                    
                
        }

        for (boolean val : boollist) {
            System.out.println(val);
        }
    }
}
