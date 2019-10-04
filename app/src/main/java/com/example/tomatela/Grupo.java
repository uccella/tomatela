package com.example.tomatela;

public class Grupo {

    private ColeccionUsuarios usuarios;
    private String nombre;

    public Grupo(String nombre, Usuario creador) {
        this.nombre = nombre;
        usuarios = new ColeccionUsuarios();
        usuarios.agregar(creador);
    }

    public void agregar(Usuario nuevoUsuario){
        usuarios.agregar(nuevoUsuario);
    }

    public void invitarTodoElGrupo(){

    }


}
