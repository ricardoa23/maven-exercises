
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I can show you a neat trick type something:");
        String userInput = scanner.nextLine();
        System.out.printf("you typed %s", userInput);

        if(StringUtils.isNumeric(userInput)) {
            System.out.printf("%s is a number", userInput);
        } else {
            System.out.printf("%s is not a number", userInput);
        }

        System.out.printf("Flipped case: %s", StringUtils.swapCase(userInput));

        System.out.printf("Reversed %s", StringUtils.reverse(userInput));


    }

}
