import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name or number of month (in English)");
        String month = scanner.nextLine();
        month = month.toLowerCase();

        switch (month){
            case "january", "1", "march", "3", "may", "5", "july", "7", "august", "8", "october", "10", "december", "12":
                System.out.println(31);
                break;
            case "april", "4", "june", "6", "september", "9", "november", "11":
                System.out.println(30);
                break;
            case "february", "2":
                System.out.println(28);
                break;
            default:
                System.err.println("Enter valid month name or number");
                break;
        }
    }
}
