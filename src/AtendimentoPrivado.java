import java.time.LocalDate;

public class AtendimentoPrivado extends Projeto{
    String tipoTerreno;
    double metragem;

    public AtendimentoPrivado(LocalDate dataRegistro, String descricao, Profissional profissional,String tipoTerreno, double metragem) {
        super(dataRegistro, descricao, profissional);
        this.metragem = metragem;
        this.tipoTerreno = tipoTerreno;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    public String getResumo(){
        return "Localização: "+tipoTerreno+ "| Metragem: "+metragem;
    }
}
