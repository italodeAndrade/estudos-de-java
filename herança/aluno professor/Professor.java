public class Professor extends pessoa {
    private double salario;
    private String materia;
    
    public void aumento_salario( double valor_aumento){
        this.salario+=valor_aumento; 
    }

    public void exibir_informação_professor(Professor p1){
        String bolas="[ materia= " +materia +" salario= "+salario+" nome= "+ super.nome + " idade= " + super.idade + " sexo= " + super.sexo+" ]";
        System.out.println(bolas);
    }


    public Professor(String nome, int idade, String sexo,double salario, String materia) {
        super(nome, idade, sexo);
        this.salario=salario;
        this.materia=materia;
    }

}
