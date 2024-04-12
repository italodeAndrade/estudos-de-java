    public class conta {
        String nomeTitular;
        String numeroConta;
        double saldo;
        public conta( String nomeTitular, String numeroConta,double saldo){
            this.nomeTitular=nomeTitular;
            this.numeroConta=numeroConta;
            this.saldo=saldo;

        }
        public void sacar(double valor){
            this.saldo-=valor;
        }
        public void depositar(double valor){
            this.saldo+=valor;
        }
        
    }
