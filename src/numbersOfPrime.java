import java.util.Scanner;

public class numbersOfPrime {
    public static void main(String[] args) {
        int count =0;
        String str ="";
        for(int i=2;;i++){
            if(count==100){
                break;
            }
            boolean ck = true;
            for (int j =2 ; j<i;j++){
                if(i%j==0){
                    ck=false;
                    break;
                }
            }
            if(ck){
                str+=i+", ";
                count++;
            }
        }
        System.out.println(str);
    }
}
