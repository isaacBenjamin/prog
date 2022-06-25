package ARREGLOS;
import java.util.ArrayList;
import java.util.Scanner;

public class MiniPro {
   
    public static ArrayList<Double> paqueteA=new ArrayList<Double>();
    public static ArrayList<Double> paqueteB=new ArrayList<Double>();
    public static ArrayList<Double> paqueteC=new ArrayList<Double>();
    public static ArrayList<Double> cancelaciones= new ArrayList<Double>();
    public static ArrayList<Double> venta= new ArrayList<Double>();
    
    public int Menu(){
        int opt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Elija una opción");
        System.out.println("1.Registrar la venta del paquete de cumpleaños");
        System.out.println("2.Registrar Cancelaciones");
        System.out.println("3.Listar las ventas realizadas por paquete");
        System.out.println("4.Listar las cancelaciones realizadas");
        System.out.println("5.Listar todas las ventas realizadas y el gran total");
        System.out.println("6.Salir del Programa");
        
        opt=sc.nextInt();
        return opt;
    }
    
    public void cancelaciones(){
        int reserva=0,days=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuantos días hasta la fecha reservada?");
        days=sc.nextInt();
        if(days<10){
            System.out.println("El periodo mínimo para realizar una cancelación es de 10 días, lo sentimos");
        }
        else{
            System.out.println("Ingrese su número de reservación");
            reserva=sc.nextInt();
            cancelaciones.add(venta.get(reserva-1));
            System.out.println("Cancelación exitosa por:"+venta.get(reserva-1));
            venta.remove(reserva-1);      
        }
    }
    public void ListarCancelaciones(){
        for(int i=0;i<cancelaciones.size();i++){
            System.out.println("cancelación#"+(i+1)+" : "+cancelaciones.get(i)); 
        }
               
    }
    public static void main(String[]args){
        
        int precio=0,i=0,decoracion=0, minuto=0,invitado=0,adicional=0, animador=0,opt=0,registrar=0;
        double impuesto=0,subtotal=0,grantotal=0;
        MiniPro mp= new MiniPro();
        
        while (opt!=6){
            opt = mp.Menu();
            Scanner sc=new Scanner(System.in);
            
            switch(opt){
                case 1:
                System.out.println("1.Paquete A:\n-Dulces-Canastitas-Refresco-Hasta 50 invitados-1 hora-precio:$300");
                System.out.println("\n2.Paquete B:\n-Dulces-Canastitas-Refresco-1 Animador-Hasta 50 invitados-1 hora-precio:$450");
                System.out.println("\n3.Paquete C:\n-Dulces-Canastitas-Refresco-1 Animador-Regalo sorpresa para el cumpleañero-Hasta 100 invitados-1 hora-precio:$550");
                registrar=sc.nextInt();
                adicional=0;
                switch(registrar){
                    case 1:
                    precio=(300);
                    System.out.println("¿Desea agregar un invitado adicional ($25c/u) 2.No");
                    adicional=sc.nextInt();
                    switch(adicional){
                        case 1: 
                        System.out.println("Ingrese el número de invitados adicionales");
                        invitado=(sc.nextInt()*25); 
                        break;
                        case 2:
                        break;                        
                    }
                    System.out.println("Desea agregar tiempo adicional\n 1.treinta minutos ($50) 2. Una hora adicional ($100) 3.No");
                    adicional=0;
                    adicional=sc.nextInt();
                    switch(adicional){
                        case 1:minuto=50;
                        break;
                        case 2:minuto=100;
                        break;
                        case 3:
                        break;
                    }
                    impuesto=(precio+minuto+decoracion+animador+invitado)*0.07;
                    subtotal=precio+minuto+decoracion+animador+invitado+impuesto;
                    
                    break;
                    case 2:
                    precio=(450);
                    System.out.println("¿Desea agregar un invitado adicional ($25c/u) 2.No");
                    adicional=sc.nextInt();
                    switch(adicional){
                        case 1: 
                        System.out.println("Ingrese el número de invitados adicionales");
                        invitado=(sc.nextInt()*25); 
                        break;
                        case 2:
                        break;                        
                    }
                    System.out.println("Desea agregar tiempo adicional\n 1.treinta minutos ($75) 2. Una hora adicional ($150) 3.No");
                    adicional=0;
                    adicional=sc.nextInt();
                    switch(adicional){
                        case 1:minuto=75;
                        break;
                        case 2:minuto=150;
                        break;
                        case 3:
                        break;
                    }
                    break;
                    case 3:
                    precio=(550);
                    System.out.println("¿Desea agregar un invitado adicional ($25c/u) 2.No");
                    adicional=sc.nextInt();
                    switch(adicional){
                        case 1: 
                        System.out.println("Ingrese el número de invitados adicionales");
                        invitado=(sc.nextInt()*25); 
                        break;
                        case 2:
                        break;                        
                    }
                    System.out.println("Desea agregar tiempo adicional\n 1.treinta minutos ($70)  2. Una hora adicional ($140) 3.No");
                    adicional=0;
                    adicional=sc.nextInt();
                    switch(adicional){
                        case 1:minuto=70;
                        break;
                        case 2:minuto=140;
                        break;
                        case 3:
                        break;
                    }
                    break;                    
                }                        
                    System.out.println("¿Desea 2 animadores para la fiesta?($75) 1.Si 2.No");
                    adicional=0;
                    adicional=sc.nextInt();
                    switch(adicional){
                        case 1:
                            animador=(75);                       
                        break;
                        case 2:
                            animador=(0);
                        break; 
                    }
                    System.out.println("Lista de temas:\n -Superheroes\n-Espacio\n-Disney\n-Mar Profundo\n ¿Desea un tema diferente($20)?\n1.Si\n2.No\n");
                    adicional=0;
                    adicional=sc.nextInt();
                    switch(adicional){
                        case 1:
                            decoracion=(20);                           
                        break;
                        case 2:
                            decoracion=(0);
                        break;
                    }
                    impuesto=(precio+minuto+decoracion+animador+invitado)*0.07;
                    subtotal=precio+minuto+decoracion+animador+invitado;
                    double total = subtotal+impuesto;
                    System.out.println("precio del paquete: "+precio+"\nInvitados adicionales: "+invitado+"\nTiempo adicional: "+minuto+"\nTema diferente: "+decoracion+"\nAnimadores adicionales: "+animador+"\nSubtotal: "+subtotal+"\nImpuesto: "+impuesto+"\nTotal: "+total);
                    if(registrar==1){
                        paqueteA.add(total);
                    }
                    else if(registrar==2){
                        paqueteB.add(total);
                    }
                    else if(registrar==3){
                        paqueteC.add(total);
                    }
                    venta.add(total);
                    System.out.println("Su número de reservación es"+venta.size());
                    break;          
                case 2:
                mp.cancelaciones();
                break;
                case 3:
                System.out.println("Ventas del Paquete A:");
                for(i=0;i<paqueteA.size();i++){
                    System.out.println(paqueteA.get(i));
                }
                System.out.println("Ventas del Paquete B: ");
                for(i=0;i<paqueteB.size();i++){
                    System.out.println(paqueteB.get(i));
                }
                System.out.println("Ventas del Paquete C: ");
                for(i=0;i<paqueteC.size();i++){
                    System.out.println(paqueteC.get(i));
                }
                break;
                case 4:
                mp.ListarCancelaciones();
                break;
                case 5:
                for(i=0;i<venta.size();i++){
                    System.out.println("Ventas realizadas");
                    System.out.println(venta.get(i));
                    grantotal+=venta.get(i);
                }
                System.out.println("Gran Total:\n"+grantotal);
                break;
            }
        }
    }
}
