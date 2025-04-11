package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {

    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123456789-99", "Victor", LocalDate.now(), "test@email.com"));
    }

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario() {
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("Victor", "025.887.860-65", LocalDate.now());

        Assertions.assertEquals("Victor", usuario.getNome());

        usuario = fabrica.incluiEndereco("99530000", 1, "Apto 405");

        Assertions.assertEquals("Apto 405", usuario.getEndereco().getComplemento());

    }
}
