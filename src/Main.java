public class Main {
    public static void main(String[] args)
    {
        Estudiante estudiante1= new Estudiante ("juan", 18, "ing Industrial");
        Estudiante estudiante2= new Estudiante ("Ana", 19, "ing Analitica");
        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();
        estudiante1.setEdad(19);
        System.out.println( " la nueva edad es de " + estudiante1.getEdad());
    }
}
