package DesignPattern.Structural;

//O facade vai emcapsular as classes e vai oferecer uma interface mais limpa,
//melhorando a legibilidade do codigo

public class Facade {
    public static void main(String[] args) {
        BancoDigital bancoDigital = new BancoDigital();
        bancoDigital.investirConta(15.00);
        bancoDigital.Btres();
        bancoDigital.investirConta(24.00);
        bancoDigital.apagarConta();
    }
}

class Investir{
    public void fazerInvestimento(double valor){
        System.out.println("Voce investiu: " + valor);
    }
}

class bolsaDeValores{
    public void mostrarBolsar(){
        System.out.println("Mostrando bolsa de valores");
    }
}
class excluirConta{
    public void apagarConta(){
        System.out.println("Apagando conta!");
    }
}
class BancoDigital{
    private Investir investir = new Investir();
    private bolsaDeValores bolsaDeValores = new bolsaDeValores();
    private excluirConta excluirConta = new excluirConta();

    public void investirConta(double valor){
        investir.fazerInvestimento(valor);
    }
    public void Btres(){
        bolsaDeValores.mostrarBolsar();
    }
    public void apagarConta(){
        excluirConta.apagarConta();
    }

}
//vai simplicar tudo em uma só classe