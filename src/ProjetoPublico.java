import java.time.LocalDate;

public class ProjetoPublico extends Projeto {
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public ProjetoPublico(LocalDate dataRegistro, String descricao, Profissional profissional,
            LocalDate dataInicio, LocalDate dataFim) {

        super(dataRegistro, descricao, profissional);
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    

}
