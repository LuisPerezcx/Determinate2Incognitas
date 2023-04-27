import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Determinante determinante = new Determinante();
        Scanner scanner = new Scanner(System.in);
        int opc=1;
        System.out.println("Ingresar coeficientes: ");
        while (opc!=0){
            determinante.calcular(scanner);
            System.out.println("0 para salir o cualquier numero para continuar:");
            opc=scanner.nextInt();
        }
    }
}
