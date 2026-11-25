import java.util.Scanner;
import java.util.Arrays;

public class Bioskop02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Alexander Severus";
        penonton[0][1] = "Basileus";
        penonton[1][0] = "Constantine";
        penonton[1][1] = "Domitian";
        penonton[2][0] = "Elagabalus";
        penonton[2][1] = "Filipus";
        penonton[3][0] = "Giganticus";
        penonton[3][1] = "Honorius";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        input.close();
    }
}