package acadamia.devDojo.maratonaJava.javaCore.Associacao.exercicio.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade,Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        if (seminarios == null) return;
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getNome());
        }
    }
}
