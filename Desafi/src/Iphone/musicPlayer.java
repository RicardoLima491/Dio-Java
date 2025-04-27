package Iphone;

public interface musicPlayer {
	static void play() {
		System.out.println("Tocando música");
		System.out.println("");
	}
	static void pause() {
		System.out.println("Pausando música");
		System.out.println("");
	}
	static void selectMusic(String musica) {
		System.out.println("Tocando a música  "+musica);
		System.out.println("");
	}
	
}
