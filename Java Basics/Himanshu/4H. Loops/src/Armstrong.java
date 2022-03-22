public class Armstrong {
    public static void main(String[] args) {
        for(int i=1;i<=500;i++){
            int num = i;
            int arm = 0;
            while (num!=0){
                int remainder = num%10;
                num = num/10;
                arm += Math.pow(remainder,3);
            }
            if(arm == i){
                System.out.println(i);
            }
        }
    }
}
