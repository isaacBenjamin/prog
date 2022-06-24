package ARREGLOS;
import java.util.Scanner;
public class OneDimension {
    private float [] array_ventas =new float [5];
public void setVentas(float[]array_ventas){
    this.array_ventas=array_ventas;
} 
public float[] getVentas(){
    return array_ventas;
}
//Conseguir el max
public float getMax(){ 
    float max = array_ventas[0]; 
    for(int i=1;i < array_ventas.length;i++){ 
      if(array_ventas[i] > max){ 
         max = array_ventas[i];
      } 
    } 
    return(max);
}
//Sucursal que más vendió
public int GetSucursal(){
    int j=0;
    float max = array_ventas[0];
    for(int i=1;i < array_ventas.length;i++){ 
        if(array_ventas[i] > max){ 
           j=i+1;
        } 
      } 
      return(j);
}
//PROMEDIO
public float GetProm(){
    float prom=0;
    for(int i=0;i < array_ventas.length;i++){
        prom=prom+array_ventas[i];
        prom=prom/array_ventas.length; 
    } 
    return(prom);
}
public int Menu(){
    int opcion=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("1.Registrar las Ventas");
    System.out.println("2.Sucursal que más ha vendido");
    System.out.println("3.Promedio de ventas para el año pasado");
    System.out.println("4.Salir");
    opcion=sc.nextInt();
    return opcion;
}   
public void IngresarDatos(){
    float ventas=0;
    float[] array_ventas = new float[5];
    int i=0;
    Scanner sc = new Scanner(System.in);
    for(i=0;i<5;i++){
        System.out.println("Ingrese el número de ventas de la sucursal"+(i+1));
        ventas = sc.nextFloat();
        array_ventas[i]=ventas;
    }
    setVentas(array_ventas); 
}
public static void main(String[]args){
    float max=0,prom=0;
    int j=0, opcion=0;
    OneDimension od=new OneDimension();
    
    while(opcion!=4){
        System.out.println("Elija una opción");
        opcion=od.Menu();
        switch(opcion){
            case 1: 
            od.IngresarDatos();
            break;
            case 2: 
            j=od.GetSucursal();
            System.out.println("La sucursal con más ventas es la número:"+j);
            max=od.getMax();
            System.out.println("Con "+max+" ventas");
            break;
            case 3: 
            prom=od.GetProm();
            System.out.println("El promedio de las ventas del año pasado es:"+prom);
            break;
        }
    }

}
}
