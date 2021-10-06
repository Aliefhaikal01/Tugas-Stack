import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {

        StackGeneric<String> stack = new StackGeneric<>(25);
        String input = "f(x)=(2x+y)-(3+(2x-x)+20)";
        Scanner alff = new Scanner(input);

        alff.useDelimiter("");

        for (int t = 0; t < 25; t++) {
            String Nkt = alff.next();
            if (Nkt.equals("(")) {
                stack.push("(");
            } else if (Nkt.equals(")")){
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    
    }
}
