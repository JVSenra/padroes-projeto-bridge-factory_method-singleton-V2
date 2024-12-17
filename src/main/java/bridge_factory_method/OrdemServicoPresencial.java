package bridge_factory_method;

public class OrdemServicoPresencial extends OrdemServico{
    public OrdemServicoPresencial(int quantDias) {
        super(quantDias);
    }

    @Override
    public float calcularCusto() {
        return (quantDias * this.servico.obterCusto()) * 1.2f;
    }
}
