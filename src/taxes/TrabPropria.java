package taxes;

/**
 *
 * @author Pedro Gomes 1131252
 */
public class TrabPropria {
    
    public final static int TAXA_RT = 3;
    public static int REND_TRAB_MAX = 50000;
    public static String profissao;
        
    
    public static int TAXA_OR(double rendimento){
        return (rendimento>REND_TRAB_MAX) ? 5 : 2;
    }

}
