import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RankingJogadores {

    public static void main(String[] args) {

        // Armazena o nome do jogador e sua pontuação
        HashMap<String, Integer> leaderboard = new HashMap<>();

        while (true) {

            String opcao = JOptionPane.showInputDialog("""
                    ===== RANKING =====
                    
                    1 - Adicionar jogador
                    2 - Ver Ranking
                    3 - Sair
                    """);

            // Usuário fechou a janela ou escolheu sair
            if (opcao == null || opcao.equals("3")) {
                break;
            }

            switch (opcao) {

                case "1":

                    String nome = JOptionPane.showInputDialog(
                            "Digite o nome do jogador:"
                    );

                    // Verifica se o nome é válido
                    if (nome == null || nome.isBlank()) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Nome inválido."
                        );
                        break;
                    }

                    int pontuacao = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Digite a pontuação:"
                            )
                    );

                    // Adiciona ou atualiza a pontuação do jogador
                    leaderboard.put(nome, pontuacao);

                    JOptionPane.showMessageDialog(
                            null,
                            "Jogador cadastrado com sucesso!"
                    );

                    break;

                case "2":

                    // Verifica se existem jogadores cadastrados
                    if (leaderboard.isEmpty()) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Nenhum jogador cadastrado."
                        );
                        break;
                    }

                    // Cria uma cópia temporária do HashMap
                    HashMap<String, Integer> leaderboardTemp =
                            new HashMap<>(leaderboard);

                    // Cria uma lista contendo todas as pontuações
                    ArrayList<Integer> listaPontuacoes =
                            new ArrayList<>(leaderboardTemp.values());

                    // Ordena as pontuações em ordem decrescente
                    Collections.sort(
                            listaPontuacoes,
                            Collections.reverseOrder()
                    );

                    String ranking = "👑 TOP PLAYERS 👑\n\n";
                    int posicao = 1;

                    // Percorre as pontuações ordenadas
                    for (Integer score : listaPontuacoes) {

                        // Procura qual jogador possui essa pontuação
                        for (String jogador : leaderboardTemp.keySet()) {

                            if (leaderboardTemp.get(jogador).equals(score)) {

                                ranking += posicao + "º - "
                                        + jogador
                                        + " | Pontuação: "
                                        + score + "\n";

                                posicao++;

                                // Remove o jogador da cópia para evitar repetição
                                leaderboardTemp.remove(jogador);

                                break;
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, ranking);

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