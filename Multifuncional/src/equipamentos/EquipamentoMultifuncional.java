package equipamentos;
import equipamentos.copiadora.*;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

	
	public void copiar() {
		System.out.println("Copiando Via multifuncional");
	}
	public void digitalizar() {
		System.out.println("Digitalizando Via multifuncional");
	}
	public void imprimir() {
		System.out.println("Imprimindo Via multifuncional");
	}
	

}
