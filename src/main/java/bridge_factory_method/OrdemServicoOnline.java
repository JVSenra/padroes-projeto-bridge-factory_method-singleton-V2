package bridge_factory_method;

public class OrdemServicoOnline extends OrdemServico{

    public OrdemServicoOnline(int quantDias) {
        super(quantDias);
    }

    @Override
    public float calcularCusto() {
        return quantDias * this.servico.obterCusto();
    }
}
