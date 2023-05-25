package kdv;
import java.util.Scanner;
public class KDV {

    public static void main(String[] args) {

        int kdv;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your price: ");
        int price = scanner.nextInt();
        
        if(price>1000){
        kdv=8;
            System.out.printf("\nPrice with vat: %f TL \nVat amount: %f TL",(double)(price+(kdv*price)/100),(double)((kdv*price)/100));
        }
        else{
        kdv=18;
            System.out.printf("\nPrice with vat: %f TL \nVat amount: %f TL",(double)(price+(kdv*price)/100),(double)((kdv*price)/100));
        }
        
    }
    
}
