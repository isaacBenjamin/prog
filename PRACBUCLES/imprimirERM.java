package PRACBUCLES;

public class imprimirERM {
    public static void main(String[]args){
        //variables locales
        int existencia=0, reorden=0, comprar=0;
        double ganancia=0, total=0;
        ERM st = new ERM(ganancia,total,existencia,reorden,comprar);
        st.getGestion();
        }    
}
