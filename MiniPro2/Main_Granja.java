package MiniPro2;
import java.util.Scanner;
public class Main_Granja {
    public static void main(String[]args){
       String[] array_nombre={"tomates","lechugas","repollos","zanahorias","papas"};
       double [] array_precio=new double[5];
       String []array_mes={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
       double[][] array_pesos_mes=new double[5][12];
       int opcion=0, i=0, j=0;
       Scanner sc=new Scanner(System.in);
       Granja gr=new Granja(array_nombre, array_precio, array_pesos_mes);
       for(i=0;i<5;i++){
        System.out.println("Ingrese el precio de los "+array_nombre[i]);
        array_precio[i]=sc.nextDouble();
        gr.setArray_nombre(array_nombre);
        gr.setArray_precio(array_precio);
       }
       while(opcion!=10){
            opcion=gr.Menu();
            switch(opcion){
                case 1:
                for(i=0;i<5;i++){
                    for(j=0;j<12;j++){
                        System.out.println("Ingrese los Kilogramos de "+array_nombre[i]+" para el mes de "+array_mes[j]);
                        array_pesos_mes[i][j]=sc.nextDouble();                       
                    }
                }
                gr.setArray_pesos_mes(array_pesos_mes); 
                break;
                case 2:
                gr.MayorPeso(array_pesos_mes);
                break;
                case 3:
                gr.MenorPeso(array_pesos_mes);
                break;
                case 4:
                gr.TotalPeso(array_pesos_mes);
                break;
                case 5:
                gr.TotalPrecio(array_pesos_mes, array_precio);
                break;
                case 6:
                gr.MayorPrecio(array_pesos_mes, array_precio);
                break;
                case 7:
                gr.MenorPrecio(array_pesos_mes, array_precio);
                break;
                case 8:
                gr.MayorMesVentas(array_pesos_mes, array_precio);
                break;
                case 9:
                gr.MenorMesVentas(array_pesos_mes, array_precio);
                break;
                case 10:
                break;
            }

       }
    }
}
