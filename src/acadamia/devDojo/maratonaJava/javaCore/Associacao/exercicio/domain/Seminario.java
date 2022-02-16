package acadamia.devDojo.maratonaJava.javaCore.Associacao.exercicio.domain;

public class Seminario {
    private String nome;
    private Local local;
    private Aluno[] alunos;
    private Professor professor;

    public Seminario(String nome, Local local, Professor professor, Aluno[] alunos) {
        this.nome = nome;
        this.local = local;
        this.professor = professor;
        this.alunos = alunos;
    }
    public Seminario(String nome, Local local, Professor professor) {
        this.nome = nome;
        this.local = local;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
    public Local getLocal() {
        return local;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(local.getLocal());
        System.out.println(professor.getNome());
        if(alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }


    }

}
