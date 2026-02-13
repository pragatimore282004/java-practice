public class FirstOccurence {
    public static int firstoccurence(int arr[],int key,int i){
        //base case
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==arr[key]){
            return i;
        }
         return firstoccurence(arr,key,i+1);
    }

    public static void main(String args[]){
    int arr[]={8,3,6,9,5,10,2,5,3};
    System.out.println("first occurence of key at index : "+firstoccurence(arr,5,0));
    }
}
