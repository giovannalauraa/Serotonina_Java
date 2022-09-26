import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Categoria {
    String urgente, naoUrgente, meta;
    ArrayList<Categoria> categorias = new ArrayList<>();
    //

    public Categoria(String meta, String urgente, String naoUrgente) {
        this.meta = meta;
        this.urgente = urgente;
        this.naoUrgente = naoUrgente;

    }
    public Categoria(Categoria categoria){
        categorias.add(categoria);

    }
    

    public void MostrarCategorias(){
        Iterator listagem = categorias.iterator();
        while(listagem.hasNext()){
            System.out.println(listagem.next());
        }
    }

    // public void Notes(){
    //     notes = new ArrayList<>();
    // }
    //  // Método para listar tarefas urgentes
    //  public void ListarUrgentes(String tarefasConcluidas){
    //     notes.add(tarefasConcluidas);
    // }
   
    // // Método para listar tarefas naoUrgentes
    // public void ListarTarefasNaoUrgentes(String tarefasUrgentes){
    //     notes.add(tarefasUrgentes);

    // }


}

