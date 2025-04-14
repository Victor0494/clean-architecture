package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuariosComArquivos {

    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorio = new RepositorioDeUsuarioEmArquivo();

        repositorio.cadastrarUsuario(new Usuario("025.872.723-99", "teste1", LocalDate.now(), "teste1@email.com"));
        repositorio.cadastrarUsuario(new Usuario("025.872.723-99", "teste2", LocalDate.now(), "teste2@email.com"));
        repositorio.cadastrarUsuario(new Usuario("025.872.723-99", "teste3", LocalDate.now(), "teste3@email.com"));
        repositorio.cadastrarUsuario(new Usuario("025.872.723-99", "teste4", LocalDate.now(), "teste4@email.com"));

//        System.out.println(repositorio.listarTodos());
        repositorio.gravaEmArquivo("usuarios.txt");
    }
}
