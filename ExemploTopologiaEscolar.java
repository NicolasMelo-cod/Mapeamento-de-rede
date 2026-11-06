package exemplografo;

public class ExemploTopologiaEscolar {

    public static void main(String[] args) {

        Grafo<String> rede = new Grafo<String>();

        // Equipamentos principais
        rede.adicionarVertice("Internet");
        rede.adicionarVertice("R1 - Roteador");
        rede.adicionarVertice("S1 - Laboratorio 1");
        rede.adicionarVertice("S2 - Laboratorio 2");
        rede.adicionarVertice("S3 - Diretoria");
        rede.adicionarVertice("S4 - Administrativo");

        // Computadores do Laboratorio 1
        for (int i = 1; i <= 10; i++) {
            rede.adicionarVertice("PC-LAB1-" + i);
        }

        // Computadores do Laboratorio 2
        for (int i = 1; i <= 10; i++) {
            rede.adicionarVertice("PC-LAB2-" + i);
        }

        // Computadores da Diretoria
        for (int i = 1; i <= 3; i++) {
            rede.adicionarVertice("PC-DIRETORIA-" + i);
        }

        // Computadores do Administrativo
        for (int i = 1; i <= 3; i++) {
            rede.adicionarVertice("PC-ADMINISTRATIVO-" + i);
        }

        // Conexoes principais, conforme a imagem
        rede.adicionarAresta(10.0, "Internet", "R1 - Roteador");
        rede.adicionarAresta(12.0, "R1 - Roteador",
                "S1 - Laboratorio 1");
        rede.adicionarAresta(15.0, "R1 - Roteador",
                "S2 - Laboratorio 2");
        rede.adicionarAresta(10.0, "R1 - Roteador",
                "S3 - Diretoria");
        rede.adicionarAresta(8.0, "S3 - Diretoria",
                "S4 - Administrativo");

        // Conexoes dos computadores do Laboratorio 1
        for (int i = 1; i <= 10; i++) {
            rede.adicionarAresta(1.0,
                    "S1 - Laboratorio 1",
                    "PC-LAB1-" + i);
        }

        // Conexoes dos computadores do Laboratorio 2
        for (int i = 1; i <= 10; i++) {
            rede.adicionarAresta(1.0,
                    "S2 - Laboratorio 2",
                    "PC-LAB2-" + i);
        }

        // Conexoes dos computadores da Diretoria
        for (int i = 1; i <= 3; i++) {
            rede.adicionarAresta(1.0,
                    "S3 - Diretoria",
                    "PC-DIRETORIA-" + i);
        }

        // Conexoes dos computadores do Administrativo
        for (int i = 1; i <= 3; i++) {
            rede.adicionarAresta(1.0,
                    "S4 - Administrativo",
                    "PC-ADMINISTRATIVO-" + i);
        }

        // Executa a busca em largura
        System.out.println("Percurso da rede escolar:");
        rede.BuscaEmLargura();
    }
}