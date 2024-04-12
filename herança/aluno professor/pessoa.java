public class pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    public void fazer_aniversario(){
        this.idade ++;
    }
 public pessoa (String nome, int idade,String sexo){
    this.nome=nome;
    this.idade=idade;
    this.sexo=sexo;
 }

 public void printar(){
    System.out.println("nome: "+ nome);
    System.out.println("sexo"+ sexo);
 }
}
