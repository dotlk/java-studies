import javax.swing.*;

public class FrameworkSwing {
    
    public static void main(String[] args) {
        //Swing é uma framework gráfica do Java utilizada para criar interfaces gráficas (GUI).
        //Ela fornece diversas classes e componentes gráficos, como janelas, botões,
        //caixas de diálogo, campos de texto, tabelas, entre outros.
        //
        //Algumas classes importantes da Swing:
        //- JFrame: cria janelas.
        //- JPanel: cria painéis.
        //- JButton: cria botões.
        //- JLabel: exibe textos ou imagens.
        //- JTextField: cria campos de texto.
        //- JOptionPane: cria caixas de diálogo.     


        //Exemplo JOptionPane
        //Mostrar Mensagem
        JOptionPane.showMessageDialog(null, "Hello World!");

        //Obter Dados
        String nome = JOptionPane.showInputDialog("Informe o seu nome");
        JOptionPane.showMessageDialog(null, "O nome informado é " + nome);

    }
}
