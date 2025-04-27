package Iphone;

public interface Cellphone {
	static void call(String number) {
		System.out.println("Discando para o numero:"+ number);
		System.out.println("");
	}
	static void answer() {
		System.out.println("Atendendo");
		System.out.println("");
	}
	static void voiceMail() {
		System.out.println("Ouvindo correio de voz");
		System.out.println("");
	}
}
