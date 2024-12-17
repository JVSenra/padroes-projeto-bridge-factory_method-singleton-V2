package singleton;

public class ServicoConsultoria implements Servico{
    private ServicoConsultoria() {};
    private static ServicoConsultoria instance = new ServicoConsultoria();
    public static ServicoConsultoria getInstance() {
        return instance;
    }
    @Override
    public float obterCusto() {
        return 100f;
    }
}
