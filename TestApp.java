import java.util.Scanner;

public class TestApp{
    public static void main(String[] args){
        System.out.println("type your infix expression");
        Scanner scn = new Scanner(System.in);
        String useinput = scn.nextLine();
        Converter conv = new Converter(useinput);
        PostfixCalculator pfCalculator = new PostfixCalculator(useinput);
        System.out.println("converted to postfix: "+conv.toPostFix());
        System.out.println("answer is "+pfCalculator.evaluate());
    }
}
