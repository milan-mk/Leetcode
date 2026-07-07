public class lt0707 {
    public static void main(String args[]) {
        // int n = 10203004;
        int n = 65463628;

        long  sum = 0;
        String x = Integer.toString(n);
        long s = 0;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c != '0') {
                s*=10;
                s += (c-'0');
                sum+=(c-'0');
            }
            }
            System.out.println(s*sum);

    }
}
