package biblioteca.stopDefinitions;

import biblioteca.service.ServicoDeBiblioteca;

public final class ContextoDeTeste {

    public static final ContextoDeTeste INSTANCIA = new ContextoDeTeste();

    private ServicoDeBiblioteca biblioteca;

    public ServicoDeBiblioteca obtemServico(boolean carrega) {
        biblioteca = ServicoDeBiblioteca.obtemServico(carrega);
        return biblioteca;
    }

    public ServicoDeBiblioteca biblioteca() {
        return biblioteca;
    }

}
