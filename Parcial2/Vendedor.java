package Parcial2;

import java.util.Scanner;

public class Vendedor {
    private double array_ventas []= new double [5];
    public int i=0, menor=0, mayor=0;
    public double promedio=0;
    public static int opcion=0;
    //CONSTRUCTOR//
    Vendedor(double array_ventas[]){
        this.array_ventas=array_ventas;
    }
    //Metodo Get
    public double [] getArray_ventas(){
        return this.array_ventas;
    }
    //Metodo Set
    public void setArray_ventas(double[]array_ventas){
        this.array_ventas=array_ventas;
    }
    //Metodos
    public double CalcularPromedio() {
        for(i=0;i<array_ventas.length;i++){
            promedio+=array_ventas[i]/array_ventas.length;
        }
        return promedio;
    }
    
    public int CalcularMenor() {
        for(i=0;i<array_ventas.length;i++){
            if(array_ventas[i]<350){
                menor++;
            }   
        }        
        return menor;
    }
    public int CalcularMayor() {
        for(i=0;i<array_ventas.length;i++){
            if(array_ventas[i]>=350){
                mayor++;
            } 
        }
        return mayor;
    }
    public static int Menu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Promedio en dólares de ventas de cada Vendedor");
        System.out.println("2.El total de las ventas en dólares para cada vendedor");
        System.out.println("3.El total de las ventas en dólares que son menor a 350 por vendedor");
        System.out.println("4.El total de las ventas en dólares cuyo monto es mayor o igual a 350 por vendedor");
        System.out.println("5.Salir");
        opcion=sc.nextInt();
        return opcion;
    }
}
