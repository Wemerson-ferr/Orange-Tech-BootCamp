package mod02.heranca_associacao_interface;

public class RodarAplicacao {
    public static void main(String[] args) {
        //Criação tradicional de objeto
        Funcionario funcionario = new Funcionario();

        //Exemplos de upcasting
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Exemplo de downcasting
        Vendedor vendedor01 = (Vendedor)new Funcionario();//Deve ser explicito quem será o alvo Funcionario -> Vendedor
        // O uso de downcasting é desencorajado, por conta de possiveis perdas de informações.
    }
}
