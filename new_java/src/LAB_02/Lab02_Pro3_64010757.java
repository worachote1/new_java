package LAB_02;
import java.util.Scanner;

public class Lab02_Pro3_64010757 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        while(year < 0){
            System.out.print("ERROR : ");
            year = sc.nextInt();
        }
        
        System.out.print("Enter month: ");
        int m = sc.nextInt();
        while(m < 1 || m > 12){
            System.out.print("ERROR : ");
            m = sc.nextInt();
        }
        if(m < 3){
            m += 12;
            year -= 1;
        }

        System.out.print("Enter day :  ");
        int q = sc.nextInt();

        while(q < 1 || q > 31 || (q > 30 && (m == 4 || m == 6 || m == 9 || m == 11)) || (q > 29 && m == 2)){
            System.out.print("ERROR  : ");
            q = sc.nextInt();
        }

        int j = year / 100;
        int k = year % 100;

        int h = (q + (26*(m+1))/10 + k/4 + j/4 + 5*j + k ) % 7;

        
        String days[] = {
        		"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"
        };
        System.out.println("The name of the day of the week is : " + days[h]);
      
    } 

}
