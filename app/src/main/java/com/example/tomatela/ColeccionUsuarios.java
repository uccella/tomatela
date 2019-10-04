package com.example.tomatela;

import java.util.ArrayList;

class ColeccionUsuarios {

    private ArrayList<Usuario> usuarios;

    public ColeccionUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void agregar(Usuario otroUsuario){
        usuarios.add(otroUsuario);
    }

    public boolean estaIncluido(Usuario otroUsuario) {
        return usuarios.contains(otroUsuario);
    }
}
