package VSCODING;
import java.util.Scanner;

final class Auto
{
    public String nombre;
    public int dc=0,codigo=0;
    public double valor=0d, impuesto=0d, descuento=0d, monto=0d;
 //CONSTRUCTOR
    public Auto(String nombre, int codigo, int dc, double valor, double impuesto, double descuento, double monto)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.dc=dc;
        this.valor = valor;
        this.impuesto=impuesto;
        this.descuento=descuento;
        this.monto=monto;
    }
}
class Main
{
    public static Auto getDetails()
    {
        String nombre="desconocido";
        int codigo=0, dc=0;
        double valor=0d, impuesto=0d,descuento=0d,monto=0d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Modelo del auto:");
        codigo=sc.nextInt();
        sc.close();
        /* ESTRUCTURAS SELECTIVAS ANIDADAS O ESTRUCTURAS SELECTIVAS EN CASCADAS*/
        if(codigo==1){
            nombre = "Sedán";
            dc=10;
            valor=10000;
            descuento =valor-(valor*dc/100);
        }
        else if(codigo==2){
            nombre = "Pickup";
            dc=12;
            valor=14000;
            descuento = valor-(valor*dc/100);
        }
        else if(codigo==3){
            nombre = "Camioneta";
            dc=5;
            valor=16000;
            descuento = valor-(valor*dc/100);
        }
        else if(codigo==4){
            nombre = "Deportivo";
            dc=2;
            valor=20000;
            descuento = valor-(valor*dc/100);
        }
        else{
            System.out.print("Valor inválido\n");
        }
        impuesto=0.10*descuento;
        monto=descuento+impuesto;
        return new Auto(nombre,codigo,dc,valor,impuesto,descuento,monto);
    }    
    public static void main(String[] args) {
        Auto au = getDetails();
        System.out.print( au.nombre + "\nValor: " + au.valor + "\nDescuento:"+ au.dc +"%\nPrecio con descuento:" + au.descuento + "\nImpuesto(10%):"+ au.impuesto+ "\nMonto a pagar:"+au.monto);
        }
}