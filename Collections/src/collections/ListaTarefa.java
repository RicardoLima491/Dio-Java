package collections;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
	private List<Tarefa> tarefaList;
	
	public ListaTarefa() {
		this.tarefaList= new ArrayList<>();
	}
public void adicionarTarefa (String descricao) {
	tarefaList.add(new Tarefa(descricao));
}
public void removerTarefa (String descricao) {
	List<Tarefa>tarefasParaRemover = new ArrayList<>();
	for (Tarefa t : tarefaList) {
		if (t.getDescricao().equalsIgnoreCase(descricao)) {
		tarefasParaRemover.add(t);
		}

		
	}
	tarefaList.removeAll(tarefasParaRemover);

	
}
	
public int obterNumeroTotaltarefas() {
	return tarefaList.size();
}
public void obterDescricoesTarefas() {
	System.out.println(tarefaList);
}
public static void main (String[] args) {
	ListaTarefa listaTarefa = new ListaTarefa();
	System.out.println("O numero total de elementos na lista é "+listaTarefa.obterNumeroTotaltarefas());
	listaTarefa.adicionarTarefa("Ricardo");
	System.out.println(listaTarefa.obterNumeroTotaltarefas());
	listaTarefa.adicionarTarefa("Ricardo");
	listaTarefa.obterDescricoesTarefas();
	listaTarefa.adicionarTarefa("Vanessa");
	System.out.println("O numero total de elementos na lista é "+listaTarefa.obterNumeroTotaltarefas());
	listaTarefa.adicionarTarefa("Carla");
	listaTarefa.adicionarTarefa("Paula ");
	listaTarefa.obterDescricoesTarefas();
	
	listaTarefa.removerTarefa("v");
	listaTarefa.obterDescricoesTarefas();
	System.out.println("O numero total de elementos na lista é "+listaTarefa.obterNumeroTotaltarefas());
}



}

