import java.util.Scanner;

public class Determinante implements Interfaz {
    int filas =2;
    int columnas =3;
    double[][] mattriz =new double[filas][columnas];
    double valor1,valor2;

    @Override
    public void calcular(Scanner scanner) {
        ingresar(scanner);
        System.out.println("Matiriz:");
        mostrar();
        System.out.println("\n Resultados:");
        valor1=(mattriz[0][2]*mattriz[1][1])-(mattriz[1][2]*mattriz[0][1]);
        valor2=(mattriz[0][0]*mattriz[1][1])-(mattriz[1][0]*mattriz[0][1]);
        System.out.println("X = " + (valor1/valor2));
        valor1=(mattriz[0][0]*mattriz[1][2])-(mattriz[1][0]*mattriz[0][2]);
        valor2=(mattriz[0][0]*mattriz[1][1])-(mattriz[1][0]*mattriz[0][1]);
        System.out.println("Y = " + (valor1/valor2));
    }
    
    @Override
    public void ingresar(Scanner scanner){
        int cont;
        for(int i = 0; i< filas; i++){
            cont=0;
            for (int j = 0; j < columnas; j++) {
                if(i==0){
                    System.out.println("ingresa x"+(cont+1)+":");
                    mattriz[i][j]= scanner.nextDouble();
                }else{
                    System.out.println("ingresa y"+(cont+1)+":");
                    mattriz[i][j]= scanner.nextDouble();
                }
                cont++;
            }
            System.out.println();
        }
    }
    @Override
    public void mostrar(){
        for(int i = 0; i< filas; i++){
            for (int j = 0; j < columnas; j++) {
                System.out.print(mattriz[i][j] + " | ");
            }
            System.out.println();
        }
    }


}
