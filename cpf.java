import java.util.Scanner;
public class cpf{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite apenas os numero do seu cpf: ");
        String cpf = input.nextLine();
        try{
            if (cpf.length()>11){
                throw new exceptionCpf(cpf);
            }else if ( cpf.length()<11 ){
                throw new Exception("O cpf digitado esta incorreto contem apenas " + cpf.length()+" numeros");
            }
            System.out.print("O CPF "+cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11)+" foi cadastrado com sucesso.");
  

        }
        catch(exceptionCpf e){
            System.out.println("Erro encontrado: "+ e);
        }
        catch(Exception e){
            System.out.println("Erro encontrado: "+ e);
        }

        
    }

}