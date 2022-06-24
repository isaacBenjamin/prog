package VSCODING;

import java.util.Scanner;
final class Days
{
    public String Nombre_Del_Mes;
    public int Dias_Del_Mes=0,mes=0,año=0;
    //CONSTRUCTOR
    public Days(String Nombre_Del_Mes,int Dias_Del_Mes,int año)
    {
        this.Nombre_Del_Mes = Nombre_Del_Mes;
        this.Dias_Del_Mes = Dias_Del_Mes;
        this.año = año;
    }
}
class Principal{

    public static Days getDetalles()
    {
        String Nombre_Del_Mes="desconocido";
        int Dias_Del_Mes=0, mes=0,año=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número del mes:\n");
        mes = sc.nextInt();
        System.out.print("Ingrese el año:\n ");
        año = sc.nextInt();
        sc.close();
        //Estructuras Selectivas
        switch (mes) {
            case 1:
                Nombre_Del_Mes = "Enero";
                Dias_Del_Mes = 31;
                
                break;
            case 2:
                Nombre_Del_Mes = "Febrero";
                if ((año % 400 == 0) || ((año % 4 == 0) && (año % 100 != 0))) {
                    Dias_Del_Mes = 29;
                } else {
                    Dias_Del_Mes = 28;
                }
                break;
            case 3:
                Nombre_Del_Mes = "Marzo";
                Dias_Del_Mes = 31;
                break;
            case 4:
                Nombre_Del_Mes = "Abril";
                Dias_Del_Mes = 30;
                break;
            case 5:
                Nombre_Del_Mes = "Mayo";
                Dias_Del_Mes = 31;
                break;
            case 6:
                Nombre_Del_Mes = "Junio";
                Dias_Del_Mes = 30;
                break;
            case 7:
                Nombre_Del_Mes = "Julio";
                Dias_Del_Mes = 31;
                break;
            case 8:
                Nombre_Del_Mes = "Agosto";
                Dias_Del_Mes = 31;
                break;
            case 9:
                Nombre_Del_Mes = "Septiembre";
                Dias_Del_Mes = 30;
                break;
            case 10:
                Nombre_Del_Mes = "Octubre";
                Dias_Del_Mes = 31;
                break;
            case 11:
                Nombre_Del_Mes = "Noviembre";
                Dias_Del_Mes = 30;
                break;
            case 12:
                Nombre_Del_Mes = "Diciembre";
                Dias_Del_Mes = 31;
                break;
            default:
                System.out.print("Valor inválido");
                break;
        }
        return new Days(Nombre_Del_Mes, Dias_Del_Mes, año);
    }     
    public static void main(String[] args) {
        Days dy = getDetalles();
        System.out.print("Mes:"+ dy.Nombre_Del_Mes + "\nCantidad de Días:"+ dy.Dias_Del_Mes +"\nAño:"+dy.año);
    }
} 