import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class App extends Informacoes {

    static List<Informacoes> informacoesList = new ArrayList<>();

    public static void main(String[] args) {

        Informacoes info = new Informacoes();
        int x;
        do {
            String[] options = {"Adicionar", "Mostrar Lista", "Consultar", "Deletar", "Atualizar", "Sair"};
            x = JOptionPane.showOptionDialog(null, "Selecione uma opção:", "CRUD",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (x) {
                case 0:
                    adicionar();
                    break;
                case 1:
                    mostrarLista();
                    break;
                case 2:
                    consultar();
                    break;
                case 3:
                    deletar();
                    break;
                case 4:
                    atualizar();
                    break;
                case 5:
                    break;
            }
        } while (x != 5);
        JOptionPane.showMessageDialog(null, "Obrigado por utilizar!");
    }


    public static void adicionar() {

        Informacoes info = new Informacoes();
        String nome = JOptionPane.showInputDialog("Adicione o nome:");
        Long cpf = Long.parseLong(JOptionPane.showInputDialog("Adicione o cpf:"));
        String endereco = JOptionPane.showInputDialog("Adicione o endereço:");
        Long telefone = Long.parseLong(JOptionPane.showInputDialog("Adicione o telefone:"));
        String cidade = JOptionPane.showInputDialog("Adicione o cidade:");
        String estado = JOptionPane.showInputDialog("Adicione o estado:");

        info.setNome(nome);
        info.setCpf(cpf);
        info.setEndereco(endereco);
        info.setTelefone(telefone);
        info.setCidade(cidade);
        info.setEstado(estado);
        informacoesList.add(info);
    }

    public static void mostrarLista() {

        StringBuilder lista = new StringBuilder("Lista de Informações:\n");

        for (Informacoes info : informacoesList) {
            lista.append(info.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, lista.toString());

    }

    public static void consultar() {

        boolean found = false;
        Long cpfConsulta = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF para consultar:"));
        for (Informacoes cadastro : informacoesList) {
            if (cadastro.getCpf() == cpfConsulta) {
                JOptionPane.showMessageDialog(null, cadastro.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado com o CPF informado.");
        }
    }

    public static void deletar() {
        boolean found = false;
        Long cpfConsulta = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF para deletar:"));
        for (Informacoes cadastro : informacoesList) {
            if (cadastro.getCpf() == cpfConsulta) {
                informacoesList.remove(cadastro);
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado com o CPF informado.");
        }
        else {
            JOptionPane.showMessageDialog(null, "O cliente foi deletado!");
        }

    }

    public static void atualizar() {
        boolean found = false;
        Long cpfConsulta = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF para atualizar o cadastro:"));
        for (Informacoes cadastro : informacoesList) {
            if (cadastro.getCpf() == cpfConsulta) {
                informacoesList.remove(cadastro);
                found = true;
                adicionar();
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado com o CPF informado.");
        }
        else {
            JOptionPane.showMessageDialog(null, "O cliente foi atualizado!");
        }
    }
}