public class DecimaltoBinary {

    public static void decimaltobinary(int n) {
        int Mynum = n;
        int pow = 0;
        int binnum = 0;
        while (n > 0) {
            int rem = n % 2;
            binnum = binnum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;   
        }
       System.out.println("Binary of " + Mynum + " = " + binnum);
    }
    public static void main(String[] args) {
        decimaltobinary(5);
    }
}
