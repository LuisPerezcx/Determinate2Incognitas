import java.util.Scanner;

public class Determinante {
    double a,b,c,d,e,f;
    double valor1,valor2;
    public void calcular(Scanner scanner){
        ingresar(scanner);
        valor1=(c*e)-(f*b);
        valor2=(a*e)-(d*b);
        System.out.println("X = " + (valor1/valor2));
        valor1=(a*f)-(d*c);
        valor2=(a*e)-(d*b);
        System.out.println("Y = " + (valor1/valor2));
    }
    private void ingresar(Scanner scanner){
        System.out.println("ingresa x1: ");
        a= scanner.nextDouble();
        System.out.println("ingresa y1: ");
        b= scanner.nextDouble();
        System.out.println("ingresa el resultado de la ecuacion 1 ");
        c= scanner.nextDouble();
        System.out.println("ingresa x2: ");
        d= scanner.nextDouble();
        System.out.println("ingresa y2: ");
        e= scanner.nextDouble();
        System.out.println("ingresa el resultado de la ecuacion 2 ");
        f= scanner.nextDouble();
    }
}
