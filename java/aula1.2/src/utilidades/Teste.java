package utilidades;
import model.Cliente;

public class Teste {
    public static void main(String ars[]){
        Cliente c1 = new Cliente();
        c1.nome = "Fulano";
        c1.rua = "Bla bla bla";
        c1.numero = 99239399;
        c1.cpf = "00323200032";       
        
        System.out.println(c1.apresentacao());
        System.out.println(c1.comprar(2));
    }
}
