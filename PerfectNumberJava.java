import java.util.Scanner;
public class PerfectNumberJava {
    public static void main(String[] args) {
        int number,  totalnumber=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bu program muhteşem sayı bulma programıdır.");
        System.out.print("Lütfen sayı giriniz: ");
        number =input.nextInt();
        if (number<1){
            System.out.println(number + " Muhteşem sayılar pozitif olur.");
        } else if (number==1) {
            System.out.println(number+" Muhteşem bir sayı değildir.");

        }
        else {for (int i = 1;i<number;i++){
            if (number%i==0){
                totalnumber+=i;
            }
        }if (totalnumber==number){
            System.out.println(number+" bir muhteşem sayıdır");
        }
        else {
            System.out.println(number+" bir muhteşem sayı değildir");
        }}
    }
}