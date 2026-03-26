class Biblioteca {
    private String nombre;
    public Biblioteca(String nombre){
        this.nombre = nombre;
    }

    public void mostrar(){
        console.writeLine("Biblioteca: " + this.nombre);
    }

    public void actualizarNombre(String nombre){
        this.nombre = nombre;
    }
}