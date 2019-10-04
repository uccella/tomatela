package com.example.tomatela;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UsuarioTest {

    @Test
    public void usuarioAniadeOtroUsuarioASuListaDeAmigosCorrectamente() {

        Usuario santiago = new UsuarioPrincipal("santiJ", "Santiago");
        Usuario agustina = new Amigo("aguGar", "Agustina");

        santiago.agregarAmigo(agustina);
        assertTrue(santiago.esAmigoDe(agustina));
    }

    @Test
    public void usuarioInvitaAOtroUsuarioYLeEnviaUnaNotificacion() {

        Usuario santiago = new UsuarioPrincipal("santiJ", "Santiago");
        Usuario agustina = new Amigo("aguGar", "Agustina");

        santiago.invitar(agustina);
        assertEquals(agustina.obtenerUltimaInvitacion(), santiago);
    }
}
