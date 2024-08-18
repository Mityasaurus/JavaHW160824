import java.util.Scanner;

public class NumbersConverter {
    public static void main(String[] args) {
        boolean work = true;
        long num;
        int inRadix;
        int outRadix;
        Scanner scanner = new Scanner(System.in);
        while(work){
            System.out.println("Enter the original number system");
            try{
                inRadix = scanner.nextInt();
            }
            catch(Exception e){
                e.printStackTrace(System.err);
                continue;
            }

            System.out.println("Enter the number to convert");
            try {
                num = scanner.nextLong(inRadix);
            } catch (Exception e) {
                e.printStackTrace(System.err);
                continue;
            }

            System.out.println("Enter the number system for the conversion");
            try{
                outRadix = scanner.nextInt();
            }
            catch(Exception e){
                e.printStackTrace(System.err);
                continue;
            }

            System.out.println("Converted number: " + Long.toString(num, outRadix));
            System.out.println();
            System.out.println("Want to convert another number? [Y/n]");

            String c = scanner.next();
            if(!c.equalsIgnoreCase("y")) work = false;
        }
    }
}
