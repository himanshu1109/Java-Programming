public class Prime {
    public static void main(String[] args) {
        for(int i=1;i<=500;i++){
            if(isPrime(i)){
                System.out.print(i+",");
            }
        }
    }
    public static boolean isPrime(int num){
        boolean is_Prime = true;
        for(int i = 2; i<num/2;i++){
            if(num%i==0){
                is_Prime = false;
            }
        }
        return is_Prime;
    }
}
