package biblioteca.stopDefinitions;

import biblioteca.service.BibliotecaService;

public final class ContextoDeTeste {

    public static final ContextoDeTeste INSTANCIA = new ContextoDeTeste();

    private BibliotecaService biblioteca;

    public BibliotecaService obtemServico(boolean carrega) {
        biblioteca = BibliotecaService.obtemServico(carrega);
        return biblioteca;
    }

    public BibliotecaService biblioteca() {
        return biblioteca;
    }

}
