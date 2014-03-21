package taxes;

/**
 *
 * @author Pedro Gomes 1131252
 */
public class Imposto extends TrabPropria, TrabOutrem, Reformado, Desempregado {

    public double calcularImposto(){
        return(OR*TAXA_OR + RT*TAXA_RT);
    }
}
