public class exceptionCpf extends Exception {
    
    private String cpf;

    public exceptionCpf(String cpf){
        this.cpf = cpf;

    }

    public String toString(){
        return "Voce digitou um cpf com "+cpf.length()+" numeros deve conter apenas 11 numeros.";
    }
}
