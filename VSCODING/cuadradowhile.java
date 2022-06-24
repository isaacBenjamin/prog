package VSCODING;
import java.lang.Math;
public class cuadradowhile{
    private int i;
    //CONSTRUCTOR
    public cuadradowhile(int i)
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
        while(i<=10){
        System.out.print("\nnumero:"+i);
        System.out.print("\ncuadrado del numero:"+Math.pow(i,2));
        i++;
        }
        return i;
    } 
}
