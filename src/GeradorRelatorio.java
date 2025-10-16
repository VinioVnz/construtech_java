import java.util.ArrayList;

public class GeradorRelatorio {
    
    private ArrayList<Projeto> projetos;

    public GeradorRelatorio(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    public void emitirRelatorio(Relatorio relatorio) {
        relatorio.formatarSaida(projetos);
    }    
}
