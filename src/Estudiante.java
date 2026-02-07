public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    public Estudiante (String nombre, int edad, String carrera)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public int getEdad()
    {
        return edad;
    }
    public void setEdad (int nuevaedad)
    {   if ( nuevaedad <= 0 )
        {
            throw new IllegalArgumentException( "La edad tiene que se mayor a 0 ");
        }

        this.edad = nuevaedad;
    }
    public void mostrarInfo (){
        System.out.println("El nombre del estudiante es: " + nombre);
        System.out.println("La edad del estudiante es: " + edad);
        System.out.println("La carrera que estudia es: " + carrera);
    }

}
