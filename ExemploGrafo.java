package exemplografo;

public class ExemploGrafo {

    public static void main(String[] args) {

        Grafo<String> grafo = new Grafo<String>();

        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Cleusa");
        grafo.adicionarVertice("Kleber");
        grafo.adicionarVertice("Claudio");

        grafo.adicionarAresta(2.0, "Paulo", "Lorenzo");
        grafo.adicionarAresta(3.0, "Lorenzo", "Kleber");
        grafo.adicionarAresta(1.0, "Kleber", "Cleusa");
        grafo.adicionarAresta(1.0, "Paulo", "Cleusa");
        grafo.adicionarAresta(2.0, "Claudio", "Lorenzo");
        grafo.adicionarAresta(3.0, "Claudio", "Paulo");
        
        grafo.BuscaEmLargura();
        
    }
}