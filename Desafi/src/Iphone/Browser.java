package Iphone;

public interface Browser {
	static void showPage(String url) {
		System.out.println("Exibindo página "+ url);
		System.out.println("");
	}
	static void addNewTab() {
		System.out.println("Abrindo nova aba");
		System.out.println("");
	}
	static void refresh() {
		System.out.println("Atualizando página");
		System.out.println("");
	}

}
