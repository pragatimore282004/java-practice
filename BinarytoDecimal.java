public class BinarytoDecimal {

    public static void binarytodecimal(int binnum) { //function
        int Mynum = binnum;
        int pow = 0;
        int decnum = 0;

        while (binnum > 0) {
            int lastdigit = binnum % 10;
            decnum = decnum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binnum = binnum / 10; 
        }

        System.out.println("Decimal of " + Mynum + " = " + decnum);
    }

    public static void main(String[] args) {
        binarytodecimal(101);  //function call
    }
}
