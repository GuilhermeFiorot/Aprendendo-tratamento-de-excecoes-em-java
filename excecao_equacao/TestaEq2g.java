import java.util.Scanner;

public class TestaEq2g {
    public static void main(String[] args) throws Exception {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Digite a:");
        String l1 = scan.nextLine();
        System.out.print("Digite b:");
        String l2 = scan.nextLine();
        System.out.print("Digite c:");
        String l3 = scan.nextLine();

        try {
            int a = Integer.parseInt(l1);
            int b = Integer.parseInt(l2);
            int c = Integer.parseInt(l3);

            Equacao2grau equacao = new Equacao2grau(a, b, c);
        } catch (NaoEhEq2grauException e) {
            System.out.println(e.getMessage());
        } catch (NaoEhRaizRealException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("\nErro, conversão de String para inteiro, digite apenas números!");
        } catch (ArithmeticException e) {
            System.out.println("\nErro, divisão por 0!");
        }
        scan.close();
    }
}