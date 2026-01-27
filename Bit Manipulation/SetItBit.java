public class SetItBit {
    public static int setitbit(int n,int i){
        int bitmask=1<<i;
        return bitmask|n;
    }
    public static void main(String args[]){
        System.out.println(setitbit(10,2));

    }
    
}
