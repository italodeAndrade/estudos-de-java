public class Pizza {
    private String sabor;
    public Pizza (String sabor){
        this.sabor=sabor;
    }
    public void mostrarmenssage(){
        System.out.println("você pediu uma pizza no sabor"+this.sabor);

    }
    public String getsabor(){
        return sabor;
    }
}
