import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

// Esta classe irá conter HashMap
public class Usuario {

    Scanner sc1 = new Scanner(System.in);

    int idUsuario, resposta;
    String nomeUsuario;
    double email;
    double senha;

    public Usuario(int idUsuario, String nomeUsuario, double email, double senha, int resposta) {
        super();
        int idUusario;
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.resposta = resposta;

        // // Criando um novo HashMap
        // HashMap<String, String> myCollection = new HashMap<>();

        // // usando o HashMap

        // myCollection.put("nomeUsuario", "idUsuario"); // ver como posso colocar id automático
        // myCollection.put("Giovanna", "1");
        // myCollection.put("email", "senha"); // arrumar uma maneira de linkar o email e senha com o nome e id
        // myCollection.put("giovanna@gmail.com", "1234");

        // Iterator it = myCollection.entrySet().iterator();
        // while (it.hasNext()) {
        //     Entry parKeyValue = (Entry) it.next();
        //     System.out.println(partKeyValue());
        //     System.out.println(partKeyValue());

        // }

    }

    private char[] partKeyValue() {
        return null;
    }

    public String getNome() {
        return null;
    }
}
