package Estabelecimento;

import equipamentos.EquipamentoMultifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;

public class Fabrica {
	public static void main (String [] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		
		Deskjet deskjet = new Deskjet();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		

		impressora.imprimir()	;
		digitalizadora.digitalizar();
		copiadora.copiar();
		deskjet.imprimir();
	
	
	
	}
}
