package Parcial2;

import java.util.Scanner;

public class Main_Vendedor {
    public static void main(String[]args){
        //VARIABLES LOCALES
        double[] array_ventas_1=new double[5];
        double[] array_ventas_2=new double[5];
        double total_1=0, total_2=0;
        int i=0,opcion=0;
        Vendedor vd1=new Vendedor(array_ventas_1);
        Vendedor vd2=new Vendedor(array_ventas_2);
        //SOLICITAMOS LOS VALORES
        Scanner sc=new Scanner(System.in);
        
        for(i=0;i<array_ventas_1.length;i++){
            System.out.println("Introduzca la venta # "+(i+1)+" del vendedor 1:");
            array_ventas_1[i]=sc.nextDouble();
        }
        vd1.setArray_ventas(array_ventas_1);
        for(i=0;i<array_ventas_2.length;i++){
            System.out.println("Introduzca la venta # "+(i+1)+" del vendedor 2:");
            array_ventas_2[i]=sc.nextDouble();
        }
        vd2.setArray_ventas(array_ventas_2);
        
        while(opcion!=5){
            opcion=Vendedor.Menu();
            switch(opcion){
                case 1:
                vd1.CalcularPromedio();     
                vd2.CalcularPromedio();
                System.out.println("El promedio de ventas en dólares del vendedor 1: "+vd1.promedio);
                System.out.println("El promedio de ventas en dólares del vendedor 2: "+vd2.promedio);
                break;
                case 2:
                for(i=0;i<5;i++){
                    total_1 += array_ventas_1[i];
                    total_2 += array_ventas_2[i]; 
                }
                System.out.println("Total del vendedor 1: "+total_1);
                System.out.println("Total del vendedor 2: "+total_2);
                break;
                case 3:
                vd1.CalcularMenor();
                vd2.CalcularMenor();
                System.out.println("El número de ventas menores a 350 del vendedor 1: "+vd1.menor);
                System.out.println("El número de ventas menores a 350 del vendedor 2: "+vd2.menor);
                break;
                case 4:
                vd1.CalcularMayor();
                vd2.CalcularMayor();
                System.out.println("El número de ventas mayores o iguales a 350 del vendedor 1: "+vd1.mayor);
                System.out.println("El número de ventas mayores o iguales a 350 del vendedor 2: "+vd2.mayor);
                break;
                case 5:
                break;
            }
        } 
    }
}
