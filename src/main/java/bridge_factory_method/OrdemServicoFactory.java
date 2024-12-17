package bridge_factory_method;

public class OrdemServicoFactory {
    public static OrdemServico obterOrdemServico(String ordemServico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("bridge_factory_method.OrdemServico" + ordemServico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Ordem de serviço inexistente");
        }
        if (!(objeto instanceof OrdemServico)) {
            throw new IllegalArgumentException("Ordem de serviço inválido");
        }
        return (OrdemServico) objeto;
    }
}
