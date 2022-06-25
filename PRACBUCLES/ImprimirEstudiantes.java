package PRACBUCLES;

public class ImprimirEstudiantes {
    public static void main(String[]args){
        //variables locales
        int alumni=0, women=0, men=0;
        double avgfemheight=0, avgfemweight=0, avgmascheight=0, avgmascweight=0;
        Estudiantes st = new Estudiantes(alumni, women,men,avgmascweight,avgfemweight,avgfemheight,avgmascheight);
        st.getDetalles();
        }    
}

