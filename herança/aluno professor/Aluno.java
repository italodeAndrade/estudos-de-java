public class Aluno extends pessoa {
    private int matricula;
    private String curso;
    public void pagar_mensalidade(){
        System.out.println("pagando mensalidade");
    }
    public Aluno(String nome,int idade,String sexo, int matricula,String curso){
        super(nome, idade, sexo);
        this.matricula=matricula;
        this.curso=curso;

    }
    public void exibir_informação_aluno(Aluno a1){
        String bolas="aluno [matricula= " + matricula + ", curso= " + curso +" nome= "+ super.nome + " idade= " + super.idade + " sexo= " + super.sexo+" ]";
        System.out.println(bolas);
    }

}
