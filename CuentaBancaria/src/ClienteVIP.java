
  public class ClienteVIP {
    private String nombre;
    private double limiteCredito;
    private String correoElectronico;

    // Constructor vacío que llama al constructor con 3 parámetros y valores predeterminados
    public ClienteVIP() {
        this("", 0.0 , "");
    }

    // Constructor con 2 parámetros de entrada y valor predeterminado para el 3er valor
    public ClienteVIP(String nombre, double limiteCredito) {
        this(nombre, limiteCredito, "");
    }

    // Constructor con todos los campos
    public ClienteVIP(String nombre, double limiteCredito, String correoElectronico) {
        this.nombre = nombre;
        this.limiteCredito = limiteCredito;
        this.correoElectronico = correoElectronico;
    }

    // Métodos getters y setters
    public String mostrarNombre() {
        return nombre;
    }

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public double mostrarLimiteCredito() {
        return limiteCredito;
    }

    public void cambiarLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String mostrarCorreoElectronico() {
        return correoElectronico;
    }

    public void cambiarCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
