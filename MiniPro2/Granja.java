package MiniPro2;
import java.util.Scanner;
public class Granja {
    public String[] array_nombre=new String[5];
    private double [] array_precio=new double[5];
    public String []array_mes={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    private double[][] array_pesos_mes=new double[5][12];
    public static int i=0, j=0;
    Granja(String array_nombre[], double array_precio[], double array_pesos_mes[][]){
        this.array_nombre=array_nombre;
        this.array_precio=array_precio;
        this.array_pesos_mes=array_pesos_mes;
    }
    //Metodo get
    public String [] getArray_nombre(){
        return this.array_nombre;
    }
    public double [] getArray_precio(){
        return this.array_precio;
    }
    public double [][] getArray_pesos_mes(){
        return this.array_pesos_mes;
    }
    //Metodo set
    public void setArray_nombre(String []array_nombre){
        this.array_nombre=array_nombre;
    }
    public void setArray_precio(double [] array_precio){
        this.array_precio=array_precio;
    }
    public void setArray_pesos_mes(double[][]array_pesos_mes){
        this.array_pesos_mes=array_pesos_mes;
    }
    public int Menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Registro de los datos");
        System.out.println("2.¿Cuál fue el producto que más kilogramos rindió al final del año?");
        System.out.println("3.¿Cuál fue el producto que menos kilogramos rindió al final del año?");
        System.out.println("4.¿Cuál fue la producción total en kilogramos de cada vegetal?");
        System.out.println("5.¿Cuál fue la producción total en dólares de cada vegetal?");
        System.out.println("6.¿Cuál fue el producto que más dinero produjo al final del año?");
        System.out.println("7.¿Cuál fue el producto que menos dinero produjo al final del año?");
        System.out.println("8.¿Cuál fue el mes que obtuvo la venta más alta?");
        System.out.println("9.¿Cuál fue el mes que obtuvo la venta más baja?");
        System.out.println("10.Salir");
        int opcion=sc.nextInt();
        return opcion;
        
    }
    //OPCION 2
    public void MayorPeso(double [][]array_pesos_mes){
        double MayorPeso=0;
        double [] array_acum_pesos=new double[5];
        String Vegetal="desconocido";
        for(i=0;i<5;i++){
            for(j=0;j<12;j++){
                array_acum_pesos[i]+=array_pesos_mes[i][j];               
            }
        }
        for (i=0;i<5; i++) {
            if (array_acum_pesos[i]>MayorPeso) {
                MayorPeso = array_acum_pesos[i];
                Vegetal=array_nombre[i];
            }
        }
        System.out.println("El producto que más KG rindió al final del año fueron \nl@s "+Vegetal+" con un total de "+MayorPeso+" Kilogramos");

    }
    //OPCION 3
    public void MenorPeso(double [][] array_pesos_mes){
        double [] array_acum_pesos=new double[5];
        double MenorPeso=0;
        String Vegetal="desconocido";
        for(i=0;i<5;i++){
            for(j=0;j<12;j++){
                array_acum_pesos[i]+=array_pesos_mes[i][j];               
            }
        }
        MenorPeso=array_acum_pesos[0];
        Vegetal=array_nombre[0];
        for (i=1;i<5; i++) {
            if (array_acum_pesos[i]<MenorPeso) {
                MenorPeso = array_acum_pesos[i];
                Vegetal=array_nombre[i];
            }
        }
        System.out.println("El producto que menos KG rindió al final del año fueron: \nL@s "+Vegetal+" con un total de "+MenorPeso+" Kilogramos");

    }
    //OPCION 4
    public void TotalPeso(double [][] array_pesos_mes){
        double [] array_acum_pesos=new double[5];
        for(i=0;i<5;i++){
            for(j=0;j<12;j++){
                array_acum_pesos[i]+=array_pesos_mes[i][j];               
            }
            System.out.println("El total de KG de "+array_nombre[i]+" es: "+array_acum_pesos[i]);
        }
    }
    //OPCION 5
    public void TotalPrecio(double [][] array_pesos_mes, double[] array_precio){
        double[][] array_ventas_mes=new double[5][12];
        double array_acum_ventas[]=new double[5];
        for(i=0;i<5;i++){
            for(j=0;j<12;j++){
                array_ventas_mes[i][j]=array_precio[i]*array_pesos_mes[i][j];
                array_acum_ventas[i]+=array_ventas_mes[i][j];                        
            }
            System.out.println("El total en dolares producido en "+array_nombre[i]+" fue de "+array_acum_ventas[i]);
        }
    }
    //OPCION 6
    public void MayorPrecio(double [][] array_pesos_mes, double[] array_precio){
        double[][] array_ventas_mes=new double[5][12];
        double MayorDinero=0;
        String Vegetal="desconocido";
        double array_acum_ventas[]=new double[5];
        for(i=0;i<5;i++){
            for(j=0;j<12;j++){
                array_ventas_mes[i][j]=array_precio[i]*array_pesos_mes[i][j];
                array_acum_ventas[i]+=array_ventas_mes[i][j];               
            }
        }
        for (i=0;i<5; i++) {
            if (array_acum_ventas[i]>MayorDinero){
                MayorDinero = array_acum_ventas[i];
                Vegetal=array_nombre[i];
            }
        }
        System.out.println("El producto que más Dinero produjo al final del año fueron \nl@s "+Vegetal+" con un total de "+MayorDinero+" dolares");
    }
    //OPCION 7
    public void MenorPrecio(double [][] array_pesos_mes, double[] array_precio){
        double[][] array_ventas_mes=new double[5][12];
        double MenorDinero=0;
        String Vegetal="desconocido";
        double array_acum_ventas[]=new double[5];
        for(i=0;i<5;i++){
            for(j=0;j<12;j++){
                array_ventas_mes[i][j]=array_precio[i]*array_pesos_mes[i][j];
                array_acum_ventas[i]+=array_ventas_mes[i][j];               
            }
        }
        MenorDinero=array_acum_ventas[0];
        Vegetal=array_nombre[0];
        for (i=1;i<5; i++){
            if (array_acum_ventas[i]<MenorDinero){
                MenorDinero = array_acum_ventas[i];
                Vegetal=array_nombre[i];
            }
        }
        System.out.println("El producto que menos Dinero produjo al final del año fueron \nl@s "+Vegetal+" con un total de "+MenorDinero+" dolares");

    }
    //OPCION 8
    public void MayorMesVentas(double [][] array_pesos_mes, double[] array_precio){
        double[][] array_ventas_mes=new double[5][12];
        double [][]array_ventas_traspuesta=new double[12][5];
        String mes="desconocido";
        double MayorMesVentas=0;
        double array_acum_ventas[]=new double[12];
        for(i=0;i<5;i++){
            for(j=0;j<12;j++){
                array_ventas_mes[i][j]=array_precio[i]*array_pesos_mes[i][j];            
            }
        }
        for(i=0;i<array_ventas_mes.length;i++){
            for(j=0;j<array_ventas_mes[0].length;j++){
                array_ventas_traspuesta[j][i]=array_ventas_mes[i][j];
                array_acum_ventas[j]+=array_ventas_traspuesta[j][i];                       
            }
        }
        for (i=0;i<12; i++) {
            if (array_acum_ventas[i]>MayorMesVentas){
                MayorMesVentas = array_acum_ventas[i];
                mes=array_mes[i];
            }
        }
        System.out.println("El mes de mayores ventas fue "+mes+" con un total de "+MayorMesVentas);        
    }
    //OPCION 9
    public void MenorMesVentas(double [][] array_pesos_mes, double[] array_precio){
        double[][] array_ventas_mes=new double[5][12];
        String mes="desconocido";
        double MenorMesVentas=0;
        double array_acum_ventas[]=new double [12];
        double [][]array_ventas_traspuesta=new double[12][5];
        for(i=0;i<5;i++){
            for(j=0;j<12;j++){
                array_ventas_mes[i][j]=array_precio[i]*array_pesos_mes[i][j];            
            }
        }
        for(i=0;i<array_ventas_mes.length;i++){
            for(j=0;j<array_ventas_mes[0].length;j++){
                array_ventas_traspuesta[j][i]=array_ventas_mes[i][j];
                array_acum_ventas[j]+=array_ventas_traspuesta[j][i];                       
            }
        }
        MenorMesVentas=array_acum_ventas[0];
        mes=array_mes[0];
        for (i=0;i<12; i++) {
            if (array_acum_ventas[i]<MenorMesVentas){
                MenorMesVentas = array_acum_ventas[i];
                mes=array_mes[i];
            }
        }
        System.out.println("El mes de menores ventas fue "+mes+" con un total de "+MenorMesVentas);          
    }
}
