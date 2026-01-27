public class PrintString{
    public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String firstname = "pragati";
        String lastname = "more";
        String fullname = firstname + " " + lastname;
        printletters(fullname);
        System.out.print(fullname.length());
    }
}
