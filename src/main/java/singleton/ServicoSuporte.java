package singleton;

public class ServicoSuporte implements Servico {
    private ServicoSuporte() {};
    private static ServicoSuporte instance = new ServicoSuporte();
    public static ServicoSuporte getInstance() {
        return instance;
    }
    @Override
    public float obterCusto() {
        return 50f;
    }
}
