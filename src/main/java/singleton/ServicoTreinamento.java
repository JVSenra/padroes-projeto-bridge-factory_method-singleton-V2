package singleton;

public class ServicoTreinamento implements Servico{
    private ServicoTreinamento() {};
    private static ServicoTreinamento instance = new ServicoTreinamento();
    public static ServicoTreinamento getInstance() {
        return instance;
    }

    @Override
    public float obterCusto() {
        return 70f;
    }
}
