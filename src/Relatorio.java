import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Relatorio {
    public String gerarRelatorio(ArrayList<Projeto> projetos);
    public void formatarSaida(ArrayList<Projeto> projetos);
    
} 
