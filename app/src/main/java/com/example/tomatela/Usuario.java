package com.example.tomatela;


public abstract class Usuario {

    private String nombreUsuario;
    private String nombre;
    private ColeccionUsuarios amigos = new ColeccionUsuarios();
    private Usuario ultimaInvitacion;

    public Usuario(String nombreUsuario, String nombre) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
    }

    public void agregarAmigo(Usuario nuevoAmigo){
        amigos.agregar(nuevoAmigo);
    }

    public void invitar(Usuario usuario){
        usuario.recibirNotificacionInvitacion(this);
    }

    private void recibirNotificacionInvitacion(Usuario usuario){
        System.out.println(usuario.generarNotificacion());
        ultimaInvitacion = usuario;
    }

    private String generarNotificacion() {
        return "Fuiste invitado por " + nombreUsuario;
    }

    public Usuario obtenerUltimaInvitacion(){
        return ultimaInvitacion;
    }

    public boolean esAmigoDe(Usuario usuario) {
        return amigos.estaIncluido(usuario);
    }

    private void cargarAmigos() {
//        amigos = (new BaseDeDatosAmigos()).obtener();
    }

}
