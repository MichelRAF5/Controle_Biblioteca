package entities;

public class Aluno {
    public int[] numeroMatricula= {1, 2, 3, 4};
    public int[] multasPendentes= {0, 1, 0, 2};
    public int[] emprestimosAtivos= {1, 0, 3, 2};
    int usuarioAtual;
    // A variável 'usuarioAtual' serve apenas para o fim de armazenar o índice do aluno sendo consultado para a ligação de dados entre os vetores

    public boolean verificarMatricula(int matricula) { //Metodo para verificar a existencia do nummero de matricula
        boolean  temMatricula = false;

        for (int i = 0; i < numeroMatricula.length; i++) {
            if (numeroMatricula[i] == matricula) {
                usuarioAtual = i;
                temMatricula = true;
                break;
            }
        }
        return temMatricula;
    }

    public boolean verificarMultas() { // Metodo para verificar a existencia de multas para este aluno
        boolean temMulta= false;

        if (multasPendentes[usuarioAtual] > 0) {
            temMulta = true;
        }
        return temMulta;
    }

    public boolean verificarEmprestimos() { // Metodo para verificar o numero de emprestimos ativos para este aluno
        boolean limiteAtingido = false;

        if (emprestimosAtivos[usuarioAtual] >= 3) {
            limiteAtingido = true;
        }
        return limiteAtingido;
    }

    public void adicionarEmprestimo() {
        emprestimosAtivos[usuarioAtual]++;
    }
}
