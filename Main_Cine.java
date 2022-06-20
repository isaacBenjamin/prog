package Parcial2;
import java.util.Scanner;
public class Main_2 {
    public static void main(String[]args){
//variables locales
        int s=0, opcion=0,a=0,k=0,menor=0,kids=0, adults=0;
        Scanner sc=new Scanner(System.in);
        Cine sala_1=new Cine(2.50, 5,a,k,menor);
        Cine sala_2=new Cine(2, 4.5,a,k,menor);
        Cine sala_3=new Cine(3, 7,a,k,menor);
        Cine sala_4=new Cine(2.75, 5.5,a,k,menor);
        Cine sala_5=new Cine(1.75, 4,a,k,menor);
        Cine[] salas={sala_1,sala_2,sala_3,sala_4,sala_5};

        for(int i=0;i<10;i++){
            System.out.println("Elija la sala");
            s=sc.nextInt()-1;
            System.out.println("Número de adultos");
            adults=sc.nextInt();
            a+=adults;
            System.out.println("Número de niños entre 1 y 11 años");
            kids=sc.nextInt();
            k+=kids;
            System.out.println("Número de niños menores a 1 año");
            menor=sc.nextInt();
            if(menor!=0){
                System.out.println("Boleto de cortesía");
            }
            salas[s].setA(a);
            salas[s].setK(k);
            salas[s].setMenor(menor);
        }
        while(opcion!=5){
            System.out.println("El total vendido en dólares");
            System.out.println("Total vendido en dólares por sala");
            System.out.println("El total vendido en dólares por sala para adultos y para niños");
            System.out.println("La cantidad de boletos vendidos por sala para adultos y para niños");
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                Cine.GranTotal(salas);
                break;
                case 2:
                Cine.TotalxSala(salas);
                break;
                case 3:
                Cine.TotalxSalaxEdad(salas);
                break;
                case 4:
                Cine.BoletosxSalaxEdad(salas);
                break;
                case 5:
                break;
            }
        }
        sc.close();
    }
} 