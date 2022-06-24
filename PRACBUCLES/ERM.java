package PRACBUCLES;
import java.util.Scanner;
public class ERM {
    public int cantidad=0,existencia=0, reorden=0, comprar=0, opcion=0;
    public double ganancia=0d, impuesto=0d, precio=0d, costo=0d, subtotal=0d, total=0;
    //CONSTRUCTOR
    public ERM(double ganancia, double total,int existencia, int reorden, int comprar)
    {
        this.ganancia=ganancia;
        this.existencia=existencia;
        this.reorden=reorden;
        this.total=total;
        this.comprar=comprar;
    }
    //metodo get
    public int getReorden(){
        return this.reorden;
    }
    public double getGanancia(){
        return this.ganancia;
    }
    public double getExistencia(){
        return this.existencia;
    }
    public double getTotal(){
        return this.total;
    }
    public int getComprar(){
        return this.comprar;
    }
    //metodo set
    public void setGestion(double ganancia, double impuesto, double total, int comprar){
       this.ganancia=ganancia;
       this.impuesto=impuesto;
       this.total=total;
       this.comprar=comprar; 
    }
    public static ERM getGestion()
    {//variable locales
        int cantidad=0,existencia=0, reorden=0, comprar=0, opcion=0;
        double ganancia=0d,precio=0d, costo=0,total=0;
        Scanner sc = new Scanner(System.in);
        while(opcion!=4){

            System.out.println("Escoja una opción");
            System.out.println("1.Calcular el importe de Venta\n2.Determinar la ganancia del producto\n3.Determinar la cantidad a comprar de un producto\n4.Salir");
            opcion=sc.nextInt();
        
            switch(opcion){
                case 1:
                System.out.println("Ingrese la cantidad del producto:");
                cantidad=sc.nextInt();
                System.out.println("Ingrese el precio del producto:");
                precio=sc.nextDouble();
                total=(cantidad*precio*0.07)+(cantidad*precio);
                System.out.println("El importe de la venta es:"+total);
                break;
                case 2:
                System.out.println("Ingrese el costo del producto");
                costo=sc.nextDouble(); 
                ganancia=precio-costo;
                if(ganancia<0){
                    System.out.println("Ajustar precio de venta");
                }
                else{
                    System.out.println("La ganancia es de:"+ganancia);
                }
                break;
                case 3:
                System.out.println("Ingresar la cantidad en existencias de un producto");
                existencia=sc.nextInt();
                System.out.println("Ingresar la cantidad de reorden de un producto");
                reorden=sc.nextInt();
                if(existencia>(reorden+20)){
                    System.out.println("No se realizó ninguna compra");
                }
                else if((existencia-reorden)<20){
                    comprar=20-(existencia-reorden);
                    System.out.println("Se hará una solicitud para comprar"+comprar+"unidades");
                }
                else if(existencia<reorden){
                    comprar=reorden-existencia+20;
                    System.out.println("Se hará una solicitud para comprar"+comprar+"unidades");
                    break;
                }
                case 4:
                System.out.println("Saliendo del programa...");
                break;
            }
            
        } 
        sc.close();
        return new ERM(ganancia,total,existencia,reorden,comprar);
        
    }

}
