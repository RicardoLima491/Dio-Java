package AgendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {


	private Map<LocalDate, Evento> eventosMap;
	
	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
		
	}
	public void exibirEventos() {
		Map <LocalDate, Evento > eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	public void obterProximoEvento() {
		
		LocalDate dataAtual = LocalDate.now();
		Map <LocalDate, Evento > eventosTreeMap = new TreeMap<>(eventosMap);
		if(!eventosTreeMap.isEmpty());
			for(var entry : eventosTreeMap.entrySet()) {
				if(entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)) {
					System.out.println("O próximo evento:"+ entry.getValue()+" acontecera no dia "+ entry.getKey());
					break;
				}
			}
		
	}
	
	
	
	
	
	
	
		public static void main(String[] args) {
			AgendaEventos agendaEventos = new AgendaEventos();
			agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JUNE, 30), "Festa", "O Rappa");
			agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 29), "Show", "U2");
			agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JUNE, 01), "Conceto", "Iron Maiden");
			agendaEventos.exibirEventos();
			agendaEventos.obterProximoEvento();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
