import java.util.ArrayList;
import java.util.Iterator;

public class Tarefa{
    String descricao;
    int numeroNota = 0;
    private ArrayList<String> notes;
    private ArrayList<Categoria> categorias;
    
    public Tarefa(String tarefas){
        super();
        this.descricao = tarefas;
        notes = new ArrayList<>();
    }

    public void Notes(){
        notes = new ArrayList<>();
    }

    // Método para listar tarefas
    public void addNota(String tarefas){
        notes.add(tarefas);
    }
   

    // Método para remover uma nota --> falta colocar uma condição (if) para perguntar se o usuário deseja remover uma nota
    public void removerNota(int index){
        if(!notes.isEmpty() && index < notes.size() - 1){
            notes.remove(index);
        }
    }

  

    // Método para mostrar as notas sem iterator
    public void mostrarNotas(int numeroNota){
        if(numeroNota < 0){
            System.out.println("Não há notas.");
        } else if(numeroNota < 0){
            System.out.println(notes.get(numeroNota));
        } else {
            System.out.println("Este não é um número de nota válido.");
        }
    }

    // Listagem de notas. com iterator --> Falta colocar uma condição (if) perguntando se o usuário deseja visualizar as notas.
    public void listarNotas(){
        Iterator<String> it = notes.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            }
        }
}

