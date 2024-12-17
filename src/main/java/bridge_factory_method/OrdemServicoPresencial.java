package bridge_factory_method;

public class OrdemServicoPresencial extends OrdemServico{

    @Override
    public float calcularCusto() {
        return (quantDias * this.servico.obterCusto()) * 1.2f;
    }
}
