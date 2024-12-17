package bridge_factory_method;

public class OrdemServicoOnline extends OrdemServico{

    @Override
    public float calcularCusto() {
        return quantDias * this.servico.obterCusto();
    }
}
