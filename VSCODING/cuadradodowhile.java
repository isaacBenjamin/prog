package VSCODING;
import java.lang.Math;
public class cuadradodowhile{
    private int i;
    //CONSTRUCTOR
    public cuadradodowhile(int i)
    {
        this.i=i;
    }
    //metodo get
    public int geti(){
        return this.i;
    }
    //ciclo repetitivo
    public int SerieNum(){
        int i=1;
        do{
        System.out.print("\nnumero:"+i);
        System.out.print("\ncuadrado del numero:"+Math.pow(i,2));
        i++;
        }while(i<=10);
        return i;
    } 
}