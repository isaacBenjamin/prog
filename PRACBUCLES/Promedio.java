package PRACBUCLES;
import java.util.Scanner;
public class Promedio {
    public double acum=0d,prom=0d;
    public int alumni=0, i=0,y=0;
    public String name;
    //CONSTRUCTOR
    public Promedio(double prom, int alumni, String name)
    {
        this.prom=prom;
        this.alumni=alumni;
        this.name=name;
    }
    //método get
    public int getAlumni(){
        return this.alumni;
    }
    public double getProm(){
        return this.alumni;
    }
    public void setPromedio(double prom, int alumni){
        this.alumni=alumni;
        this.prom=prom;
    }
    public static Promedio getPromedio()
    {
        double acum=0d, prom=0d;
        int alumni=0, i=0, y=0;
        String name="Desconocido";
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de alumnos");
        alumni=sc.nextInt();
        for(i=0;i<alumni;i++){
            acum=0;
            System.out.println("Ingrese su nombre\n");
            name=sc.next();
            for(y=0;y<4;y++){
                System.out.println("Inserte su nota Parcial\n");
                acum+=sc.nextDouble();
            }
            prom=acum/4;
            System.out.println(name+" su promedio es "+prom);
            if(prom>90){
                System.out.println("\nSu promedio corresponde a una A\n");
            }
            else if(prom>80 && prom<=90){
                System.out.println("\nSu promedio corresponde a una B\n");
            }
            else if(prom>70 && prom<=80){
                System.out.println("\nSu promedio corresponde a una C\n");
            }
            else if(prom>60 && prom<=70){
                System.out.println("\nSu promedio corresponde a una D\n");
            }
            else if(prom<=60){
                System.out.println("\nSu promedio corresponde a una F\n");
            }
        }
        return new Promedio(prom, alumni,name);
    }
    
}
