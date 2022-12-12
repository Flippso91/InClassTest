import java.util.Objects;
import java.util.Scanner;

//sorry, screwed this one up hard when setting up and wasn't able to recover. Misread everything and time
//was wasted. I apologise for the attempt. F

public class employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, pps, type;
        char test = 0;

        while(true) {
            System.out.println("Please enter name");

            name = input.next();
            if(name.length()>2 && name.length()<26){
                System.out.println("you entered: " + name);
                break;
            }
            else{
                System.out.println("Please enter name with more characters between 3 and 25 inclusive");
            }
        }
        while(true){
            System.out.println("Please enter PPS");
            pps = input.next();
            if(pps.length()==11){
                System.out.println("you entered" + pps);
                break;
            }
            else{
                System.out.println("Please enter PPSN of 11 characters only");
            }

        }
        while(true){
            System.out.println("Please enter Employment Type");
            System.out.println("f for Full-Time, p for Part-Time, c for Contract");
            type = input.next();
            if(!Objects.equals(type, "f") && !Objects.equals(type, "p") && !Objects.equals(type, "c")){
                System.out.println("Please enter one valid letter only");
            }
            else {
                test = type.charAt(0);
                switch (test) {
                    case 'f':
                        System.out.println("You have chosen Full-Time");
                        break;
                    case 'p':
                        System.out.println("You have chosen Part-Time");
                        break;
                    case 'c':
                        System.out.println("You have chosen Contract");
                        break;
                }
                break;
            }
        }


    }
}
