/**
 * 从100到999，求水仙花数，如：153 = 1^3 + 5^3 + 3^3
 */
public class NarcissisticNum {
    public static void main(String[] args) {
        int num,wordToken = 0;

        for(num=100;num<=999;num++){
            int i = num/100%10;
            int j = num/10%10;
            int k = num%10;

            if(i*i*i+j*j*j+k*k*k == num){
                wordToken++;
                System.out.printf("%-5d",num);
                
                if(wordToken == 2){
                    System.out.print("\n");
                    wordToken = 0;
                }
            }
        }

    }
}
