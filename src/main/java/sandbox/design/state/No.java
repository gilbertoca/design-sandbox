package sandbox.design.state;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author gilberto.andrade
 */
public class No {

    private Set<No> adjacentes = new HashSet<No>();
    private Cor cor;
    private String nome;

    public No(String nome) {
        this.nome = nome;
        cor = new Branco();
    }

    public void buscaProfundidade(List<No> list) {
        cor.busca(this, list);
    }

    public Set<No> getAdjacentes() {
        return adjacentes;
    }

    public void addAdjacentes(No adj) {
        adjacentes.add(adj);
    }

    public void setCor(Cor cor, List<No> list) {
        this.cor = cor;
        cor.assumiu(this, list);
    }

    public String toString() {
        return nome;
    }
}
