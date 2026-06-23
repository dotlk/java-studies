import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;

public class CRUDProdutos {

    public static void main(String[] args) {

        // Nome do produto -> [segmento, marca, valor]
        HashMap<String, ArrayList<String>> produtos = new HashMap<>();

        while (true) {

            String opcao = JOptionPane.showInputDialog("""
                    ===== SISTEMA DE PRODUTOS =====
                    
                    1 - Cadastrar produto
                    2 - Listar produtos
                    3 - Filtrar por marca
                    4 - Alterar produto
                    5 - Remover produto
                    6 - Sair
                    """);

            // Usuário fechou a janela ou escolheu sair
            if (opcao == null || opcao.equals("6")) {
                break;
            }

            switch (opcao) {

                // CADASTRAR PRODUTO
                case "1":

                    String nome = JOptionPane.showInputDialog(
                            "Digite o nome do produto:"
                    );

                    if (nome == null || nome.isBlank()) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Nome inválido."
                        );
                        break;
                    }

                    String segmento = JOptionPane.showInputDialog(
                            "Digite o segmento do produto:"
                    );

                    String marca = JOptionPane.showInputDialog(
                            "Digite a marca do produto:"
                    );

                    String valor = JOptionPane.showInputDialog(
                            "Digite o valor do produto:"
                    );

                    ArrayList<String> dadosProduto =
                            new ArrayList<>();

                    dadosProduto.add(segmento);
                    dadosProduto.add(marca);
                    dadosProduto.add(valor);

                    produtos.put(nome, dadosProduto);

                    JOptionPane.showMessageDialog(
                            null,
                            "Produto cadastrado com sucesso!"
                    );

                    break;

                // LISTAR PRODUTOS
                case "2":

                    if (produtos.isEmpty()) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Nenhum produto cadastrado."
                        );
                        break;
                    }

                    String lista = "===== PRODUTOS =====\n\n";

                    for (String produto : produtos.keySet()) {

                        ArrayList<String> dados =
                                produtos.get(produto);

                        lista += "Produto: " + produto
                                + "\nSegmento: " + dados.get(0)
                                + "\nMarca: " + dados.get(1)
                                + "\nValor: R$ " + dados.get(2)
                                + "\n\n";
                    }

                    JOptionPane.showMessageDialog(null, lista);

                    break;

                // FILTRAR POR MARCA
                case "3":

                    if (produtos.isEmpty()) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Nenhum produto cadastrado."
                        );
                        break;
                    }

                    String marcaFiltro = JOptionPane.showInputDialog(
                            "Digite a marca:"
                    );

                    String resultado =
                            "===== PRODUTOS ENCONTRADOS =====\n\n";

                    boolean encontrou = false;

                    for (String produto : produtos.keySet()) {

                        ArrayList<String> dados =
                                produtos.get(produto);

                        if (dados.get(1)
                                .equalsIgnoreCase(marcaFiltro)) {

                            resultado += "Produto: " + produto
                                    + "\nSegmento: " + dados.get(0)
                                    + "\nMarca: " + dados.get(1)
                                    + "\nValor: R$ " + dados.get(2)
                                    + "\n\n";

                            encontrou = true;
                        }
                    }

                    if (!encontrou) {
                        resultado = "Nenhum produto encontrado.";
                    }

                    JOptionPane.showMessageDialog(
                            null,
                            resultado
                    );

                    break;

                // ALTERAR PRODUTO
                case "4":

                    if (produtos.isEmpty()) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Nenhum produto cadastrado."
                        );
                        break;
                    }

                    String produtoAntigo =
                            JOptionPane.showInputDialog(
                                    "Digite o nome do produto que deseja alterar:"
                            );

                    if (!produtos.containsKey(produtoAntigo)) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Produto não encontrado."
                        );

                        break;
                    }

                    String novoNome =
                            JOptionPane.showInputDialog(
                                    "Digite o novo nome:"
                            );

                    String novoSegmento =
                            JOptionPane.showInputDialog(
                                    "Digite o novo segmento:"
                            );

                    String novaMarca =
                            JOptionPane.showInputDialog(
                                    "Digite a nova marca:"
                            );

                    String novoValor =
                            JOptionPane.showInputDialog(
                                    "Digite o novo valor:"
                            );

                    produtos.remove(produtoAntigo);

                    ArrayList<String> novosDados =
                            new ArrayList<>();

                    novosDados.add(novoSegmento);
                    novosDados.add(novaMarca);
                    novosDados.add(novoValor);

                    produtos.put(novoNome, novosDados);

                    JOptionPane.showMessageDialog(
                            null,
                            "Produto atualizado com sucesso!"
                    );

                    break;

                // REMOVER PRODUTO
                case "5":

                    if (produtos.isEmpty()) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Nenhum produto cadastrado."
                        );

                        break;
                    }

                    String remover =
                            JOptionPane.showInputDialog(
                                    "Digite o nome do produto que deseja remover:"
                            );

                    if (!produtos.containsKey(remover)) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Produto não encontrado."
                        );

                        break;
                    }

                    produtos.remove(remover);

                    JOptionPane.showMessageDialog(
                            null,
                            "Produto removido com sucesso!"
                    );

                    break;

                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida."
                    );
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Programa encerrado."
        );
    }
}
