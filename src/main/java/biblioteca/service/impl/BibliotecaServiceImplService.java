package biblioteca.service.impl;

import biblioteca.model.entity.Livro;
import biblioteca.repository.LivroDAO;
import biblioteca.Topico;
import biblioteca.service.BibliotecaService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BibliotecaServiceImplService implements BibliotecaService {
    private final LivroDAO dao;

    public BibliotecaServiceImplService(boolean carregaBibioteca) {
        this.dao = new LivroDAO();
        if (carregaBibioteca) {
            this.dao.carregaBiblioteca(LivroDAO.DEFAULT_PATH);
        }
    }

    @Override
    public Livro pesquisaLivroPorTitulo(String title) {
        return dao.obtemLivroComTitulo(title);
    }

    @Override
    public List<Livro> pesquisaLivrosDeComputacaoAgrupadosPorTitulo() {
        return dao.obtemListaDeLivrosComputacaoOrganizadaPorTitulo();
    }

    @Override
    public Optional<Topico> topicoMaisPopular() {
        return dao.topicoMaisPopular();
    }

    @Override
    public List<String> pesquisaTitulosDosLivros() {
        return dao.obtemTitulosDosLivros();
    }

    @Override
    public Map<Topico, List<Livro>> livrosAgrupadosPorTopico() {
        return dao.livrosAgrupadosPorTopico();
    }

    @Override
    public Map<Topico, Long> contagemDosLivrosPorTopico() {
        return dao.contagemDeLivrosPorTopico();
    }

    @Override
    public int contagemDosLivros() {
        return dao.contagemDosLivros();
    }

    @Override
    public void adiciona(Livro livro) {
        this.dao.adiciona(livro);
    }
}