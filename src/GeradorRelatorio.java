import java.util.ArrayList;

public class GeradorRelatorio {
    
    private ArrayList<Projeto> projetos;

    public GeradorRelatorio(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    // Método para gerar qualquer tipo de relatório
    public void emitirRelatorio(Relatorio relatorio) {
        relatorio.formatarSaida(projetos);
    }    
}
