package entities;

public class Livro {
    public int idLivro[] = {1, 2, 3, 4};
    public String nomeLivro[] = {"O Código Limpo", "O Senhor dos Anéis: A Sociedade do Anel", "Duna", "Dom Casmurro"};
    public String autorLivro[] = {"Robert C. Martin", "J.R.R. Tolkien", "Frank Herbert", "Machado de Assis"};
    public boolean disponivel[] = {true, true, false, true};
    int livroAtual; // A variável 'livroAtual' serve apenas para o fim de armazenar o índice do livro sendo consultado para a ligação de dados entre os vetores

    public boolean verificarLivro(int id) { // Metodo para verificar a existência do livro
        boolean temLivro = false;

        for (int i = 0; i < idLivro.length; i++) {
            if (idLivro[i] == id) {
                livroAtual = i;
                temLivro = true;
                break;
            }
        }

        return temLivro;
    }

    public boolean verificarDisponivel() { // Metodo para verificar a disponibilidade do livro
        boolean estaDisponivel = false;

        if (disponivel[livroAtual]) {
            estaDisponivel = true;
        }
        return estaDisponivel;
    }

    public String resumoLivro() { // Metodo que exibe os dados do livro a ser consultado
        return "Nome: " + nomeLivro[livroAtual] +
                "\nAutor: " + autorLivro[livroAtual];
    }

    public void tirarDisponibilidade() {
        disponivel[livroAtual] = false;
    }
}
