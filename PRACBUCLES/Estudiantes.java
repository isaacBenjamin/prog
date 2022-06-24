package PRACBUCLES;
import java.util.Scanner;
public class Estudiantes
{
    public int alumni=0, women=0,men=0;
    public double avgmascheight=0d, avgfemheight=0d, avgmascweight=0d, avgfemweigth=0d;
 //CONSTRUCTOR
    public Estudiantes(int alumni, int women, int men, double avgmascheight, double avgfemheight, double avgmascweight, double avgfemweigth)
    {
        this.alumni=alumni;
        this.women=women;
        this.men=men;
        this.avgmascheight=avgmascheight;
        this.avgfemheight=avgfemheight;
        this.avgmascweight=avgmascweight;
        this.avgfemweigth=avgfemweigth;  
    }
//metodo get
    public int getAlumni(){
        return this.alumni;
    }
    public int getWomen(){
        return this.women;
    }
    public int getMen(){
        return this.men;
    }
    public double getAvgMascHeight(){
        return this.avgmascheight;
    }
    public double getAvgFemHeight(){
        return this.avgfemheight;
    }
    public double getAvgMascWeight(){
        return this.avgmascweight;
    }
    public double getAvgFemWeight(){
    return this.avgfemweigth;
    }
// metodo set
    public void setAlumni(int alumni, int women, int men, double avgmascheight, double avgfemheight, double avgmascweight, double avgfemweigth){
    this.alumni=alumni;
    this.women=women;
    this.men=men;
    this.avgmascheight=avgmascheight;
    this.avgfemheight=avgfemheight;
    this.avgmascweight=avgmascweight;
    this.avgfemweigth=avgfemweigth;
    }

    public static Estudiantes getDetalles()
    {//variables locales
        int i=0,sex=0, alumni=0, women=0, men=0;
        double avgmascweight=0d,avgfemweight=0d, avgfemheight=0d, avgmascheight=0d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes:");
        alumni=sc.nextInt();
        while(i<alumni){
            System.out.println("Género del estudiante:\n1.Femenino\n2.Masculino\n");
            sex=sc.nextInt();
            /* ESTRUCTURAS SELECTIVAS ANIDADAS O ESTRUCTURAS SELECTIVAS EN CASCADAS*/
            if(sex==1){
                women++;
                System.out.println("Ingrese la estatura de la estudiante");
                avgfemheight+=sc.nextDouble();
                System.out.println("Peso de la estudiante");
                avgfemweight+=sc.nextDouble();
            }
            else{
                men++;
                System.out.println("Ingrese la estatura del estudiante");
                avgmascheight+=sc.nextDouble();
                System.out.println("Peso del estudiante");
                avgmascweight+=sc.nextDouble();
            }
            i++;        
        }
        sc.close();
        avgmascheight=avgmascheight/men;
        avgfemheight=avgfemheight/women;
        avgfemweight=avgfemweight/women;
        avgmascweight=avgmascweight/men;
        System.out.println("Numero de alumnos: "+alumni);
        System.out.println("Numero de mujeres: "+women);
        System.out.println("Numero de hombres: "+men);
        System.out.println("Promedio de altura masculina: "+avgmascheight);
        System.out.println("Promedio de altura femenina: "+avgfemheight);
        System.out.println("Promedio de Peso masculino: "+avgmascweight);
        System.out.println("Promedio de Peso Femenino: "+avgfemweight);  
        
        return new Estudiantes(alumni, women,men,avgmascweight,avgfemweight,avgfemheight,avgmascheight);
    } 
}