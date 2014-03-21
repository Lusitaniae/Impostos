package taxes;

/**
 *
 * @author Pedro Gomes 1131252
 */
public class TrabOutrem {

    public final static int TAXA_OR = 2;
    public final static int REND_TRAB_MAX = 30000;
    public static String nomeEmpresa;
    
    public int taxa_rt(double rendimento){
        return (rendimento>REND_TRAB_MAX) ? 2 : 1;
    }
}
