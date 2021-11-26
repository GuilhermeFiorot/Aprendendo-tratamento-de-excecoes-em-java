public class Equacao2grau {

    public Equacao2grau(int a, int b, int c) throws NaoEhEq2grauException, NaoEhRaizRealException {
        int delta = (int)Math.pow(b,2) - 4*a*c;
        if (b == 0 || c == 0){
            throw new NaoEhEq2grauException("\nNão é equação do 2 grau!");
        } else if(delta < 0){
            throw new NaoEhRaizRealException("\nNão possui raiz real, delta é menor que 0!");
        } else {
            System.out.println("\nraiz 1: "+raiz1(a, b, c, delta));
            System.out.println("raiz 2: "+raiz2(a, b, c, delta));
        }
    }

    public int raiz1(int a, int b, int c, int delta){
        int raiz1 = (-b + (int)Math.sqrt(delta)) / (int)(2*a);
        return raiz1;
    }
    
    public int raiz2(int a, int b, int c, int delta){
        int raiz2 = (-b - (int)Math.sqrt(delta)) / (int)(2*a);
        return raiz2;
    }
}
