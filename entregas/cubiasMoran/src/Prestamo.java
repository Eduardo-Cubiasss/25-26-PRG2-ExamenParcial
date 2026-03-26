class Prestamo{
    private Usuario usuario;
    private Libro libro;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;

    public Prestamo (Usuario usuario, Libro libro, Date fechaInicio, Date fechaFin, String estado){
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public void actualizarUsuario(Usuario usuario){
        this.usuario = usuario
    }

    public void actualizarLibro(Libro libro){
        this.libro = libro
    }

    public void actualizarFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio
    }

    public void actualizarFechaFin(Date fechaFin){
        this.fechaFin = fechaFin
    }

    public void actualizarEstado(String estado){
        this.estado = estado
    }

    public void mostrar(){
        console.writeLine("Prestamo: ");
        console.writeLine("Usuario: " + this.usuario);
        console.writeLine("Libro: " + this.libro);
        console.writeLine("Fecha de inicio: " + this.fechaInicio);
        console.writeLine("Fecha de fin: " + this.fechaFin);
        console.writeLine("Estado: " + this.estado);
    }

}
    