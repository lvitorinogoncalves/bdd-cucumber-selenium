package biblioteca.service;

import biblioteca.service.impl.BibliotecaServiceImplService;
import biblioteca.model.entity.Livro;
import biblioteca.Topico;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BibliotecaService {

    public static BibliotecaService obtemServico() {
        return new BibliotecaServiceImplService(true);
    }

    public static BibliotecaService obtemServico(boolean carregaBibioteca) {
        return new BibliotecaServiceImplService(carregaBibioteca);
    }

    Livro pesquisaLivroPorTitulo(String titulo);

    List<Livro> pesquisaLivrosDeComputacaoAgrupadosPorTitulo();

    Optional<Topico> topicoMaisPopular();

    List<String> pesquisaTitulosDosLivros();

    Map<Topico, List<Livro>> livrosAgrupadosPorTopico();

    Map<Topico, Long> contagemDosLivrosPorTopico();

    int contagemDosLivros();

    void adiciona(Livro livro);
}