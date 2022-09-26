import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    // Sempre definir uma variável global como static

    public static ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Categoria> bancoDeCategorias = new ArrayList<>();
        Categoria categoria = new Categoria("Metas", "Urgente", "Não urgente");
        Categoria categoriaArray = new Categoria(categoria);

        Rotina rotina = new Rotina(1, "a um curso", "*Notificação*", 1);
        int opcao = 0;
        do {
            Usuario usuario = new Usuario(1, "Giovanna", opcao, opcao, opcao);
            System.out.println("Bem vindo!" + usuario.getNome());
            System.out.println("Qual opção você quer selecionar?");
            System.out.println("1   -   Registrar uma meta");
            System.out.println("2   -   Listar categorias");
            System.out.println("3   -   Mostrar dados do usuário");
            System.out.println("4   -   Criar Tarefa");
            System.out.println("5   -   Listar Tarefas");

            System.out.println("Digite qualquer outro número para sair");
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 1:
                    funcaoOpcao1();
                    rotina.MostrarMetas();
                    break;
                case 2:
                    funcaoOpcao2();
                    categoria.MostrarCategorias();
                    break;
                case 3:
                    funcaoOpcao3();
                    break;
                case 4:
                    System.out.println("Insira a descrição da tarefa");
                    String descTarefa = entrada.nextLine();
                    Tarefa tarefas = new Tarefa(descTarefa);
                    System.out.println("Insira uma nova para a tarefa");
                    String nota = entrada.nextLine();
                    tarefas.addNota(nota);
                    listaTarefas.add(tarefas);
                    break;
                case 5:
                    Iterator<Tarefa> it = listaTarefas.iterator();
                    while (it.hasNext()) {
                        Tarefa t = it.next();
                        System.out.println(t.descricao);
                        t.listarNotas();
                    }
                    break;
                default:
                    break;
            }
        } while (opcao != 0);
    }

    private static void funcaoOpcao2() {
    }

    private static void funcaoOpcao1() {

        /* PRIMEIRA PERGUNTA */
        String meta = "";
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Selecione uma meta?");
            System.out.println("1 - Cuidado escolar");
            System.out.println("2 - Cuidado profissional");
            int metaSelect = entrada.nextInt();
            switch (metaSelect) {
                case 1:
                    meta = "Cuidado escolar";
                    break;
                case 2:
                    meta = "Cuidado profissional";
                    break;
                default:
                    System.out.println("Opção invalida, digite novamente");
                    break;
            }
        } while (meta.isEmpty());

        /* SEGUNDA PERGUNTA */
        /** Código */

        /* TERCEIRA PERGUNTA */
        /** Código */
        /*
         * String urgente, naoUrgente;
         * Categoria categoria = new Categoria(meta, urgente, naoUrgente);
         * ArrayList<Categoria> categorias;
         * categorias.add(categoria);
         */
    }

    /*
     * private static void funcaoOpcao2() {
     * Iterator<Categoria> it = .iterator();
     * while (it.hasNext()) {
     * Categoria c = it.next();
     * System.out.println(c.meta);
     * }
     * }
     */

    private static void funcaoOpcao3() {
        System.out.println();
    }

}
