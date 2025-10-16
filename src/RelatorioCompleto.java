import java.util.ArrayList;
import java.util.Comparator;

public class RelatorioCompleto implements Relatorio{

    @Override
    public void formatarSaida(ArrayList<Projeto> projetos) {
        System.out.println("Relatorio completo:");
        System.out.println(gerarRelatorio(projetos));
    }

    @Override
    public String gerarRelatorio(ArrayList<Projeto> projetos) {
        projetos.sort(Comparator.comparingInt(Projeto::getId));
        String relatorio = "";
        for(Projeto p : projetos){
            relatorio+= "Id: "+p.getId() + " | Descrição: "+p.getDescricao()+ "\n";
        }
        return relatorio;
    }
    
}
