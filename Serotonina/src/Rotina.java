import java.util.ArrayList;
import java.util.Iterator;

public class Rotina {
    double horario, data;
    String nomeDaMeta, notificacao;
    int id, resposta;
    ArrayList<String> metas = new ArrayList<>();
    Iterator listagem = metas.iterator();

    public Rotina(double horario, String nomeDaMeta, String notificao, int id){
        super();
        this.horario = horario;
        this.nomeDaMeta = nomeDaMeta;
        this.notificacao = notificao;
        this.id = id;
    }

    public void Metas(Rotina rotina){
        metas.addAll(metas);

    }

    public void MostrarMetas(){
        while(listagem.hasNext()){
            System.out.println(listagem.next());

        }
        
        

            
        }


   
    }
