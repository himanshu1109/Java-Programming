public class PrintingArray {
    public static void main(String[] args) {
        String[] arr = {"Sunday", "Monday" , "Tuesday" , "Wednesday", "Thursday", "Friday" , "Saturday"};
        System.out.println("Days in week are: ");
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
