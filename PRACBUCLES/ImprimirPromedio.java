package PRACBUCLES;
public class ImprimirPromedio {
    public static void main(String[]args){
        //Variables locales
        int alumni=0;
        double prom=0;
        String name="desconocido";
        Promedio pr= new Promedio(prom,alumni,name);
        pr.getPromedio();
    }    
}
