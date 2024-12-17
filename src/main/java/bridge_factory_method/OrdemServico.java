package bridge_factory_method;
import singleton.Servico;

public abstract class OrdemServico {
    protected Servico servico;
    protected int quantDias;
    public OrdemServico() {
    }

    public void setQuantDias(int quantDias) {
        this.quantDias = quantDias;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public abstract float calcularCusto();
}
