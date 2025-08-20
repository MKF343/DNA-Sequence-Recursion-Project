import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[DNA Reverser and Translator]");
        System.out.print("Enter a sequence: ");
        String sequence = input.nextLine();
        if(!DNALib.validator(sequence)){
            System.out.println("Your DNA sequence is not valid.");
        }else{
            String reversed = DNALib.reverser(sequence);
            String inverted = DNALib.inverser(reversed);
            String translated = DNALib.translator(inverted);
            System.out.println("Your DNA sequence reversed and translated is: \n" + translated);
        }
        input.close();
    }
}