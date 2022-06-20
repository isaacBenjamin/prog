package Parcial2;
public class Cine {
    public Object[]salas=new Object[5];
    public static int i=0, s=0;
    public double precio_kids=0, precio_adults=0;
    public int a=0,k=0,menor=0;
    //CONSTRUCTOR
    Cine(double precio_kids, double precio_adults,int a,int k,int menor){
        this.precio_kids=precio_kids;
        this.precio_adults=precio_adults;
        this.a=a;
        this.k=k;
        this.menor=menor;    
    }
    //Metodo get
    public Object getSalas(){
        return this.salas;
    }
    public double getPrecio_kids(){
        return this.precio_kids;
    }
    public double getPrecio_adults(){
        return this.precio_adults;
    }

    public int getA(){
        return a;
    }
    public int getK(){
        return k;
    }
    public int getMenor(){
        return menor;
    }
    //Metodo set
    public void setSalas(Object []salas){
        this.salas=salas;
    }
    public void setPrecio_kids(double precio_kids){
        this.precio_kids=precio_kids;
    }
    public void setPrecio_adults(double precio_adults){
        this.precio_adults=precio_adults;
    }

    public void setA(int a){
        this.a=a;
    }
    public void setK(int k){
        this.k=k;
    }
    public void setMenor(int menor){
        this.menor=menor;
    }
    //Metodos
    public static void GranTotal(Cine[]salas){
        double GranTotal=0;
        for(s=0;s<5;s++){
            GranTotal+=salas[s].precio_kids*salas[s].k+salas[s].precio_adults*salas[s].a;
        }
        System.out.println("Total:$ "+GranTotal); 
    }
    public static void TotalxSala(Cine[]salas){
        for(s=0;s<5;s++){
            System.out.println("Ventas en la sala "+(s+1)+":");
            System.out.println(salas[s].precio_kids+salas[s].precio_adults);
        }
    }
    public static void TotalxSalaxEdad(Cine[]salas){
        for(s=0;s<5;s++){
            System.out.println("Sala "+(s+1));
            System.out.println("Niños: "+salas[s].precio_kids*salas[s].k);
            System.out.println("Adultos: "+salas[s].precio_adults*salas[s].a);
        }
    }
    public static void BoletosxSalaxEdad(Cine[]salas){
        for(s=0;s<5;s++){
            System.out.println("Sala "+(s+1));
            System.out.println("Boletos vendidos a adultos: "+salas[s].a);
            System.out.println("Boletos vendidos a niños: "+(salas[s].k+salas[s].menor));
        }
    }
    
    


}
