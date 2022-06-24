package VSCODING;
import java.lang.Math;
public class cuadradofor{
    private int i;
    //CONSTRUCTOR
    public cuadradofor(int i)
    {
        this.i=i;
    }
    //metodo get
    public int geti(){
        return this.i;
    }
    //ciclo repetitivo
    public int SerieNum(){
        int i;
        for(i=1;i<=10;i++){
        System.out.print("\nnumero:"+i);
        System.out.print("\ncuadrado del numero:"+Math.pow(i,2));
        }
        return i;
    } 
}
