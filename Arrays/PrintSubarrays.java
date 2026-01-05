public class PrintSubarrays {
    public static void printsubarrays(int numbers[]){
    int totsubarrays=0;
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(numbers[k]+" ");
            }
            totsubarrays++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("totsubarrays:" + totsubarrays );
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printsubarrays(numbers);
    }
}
