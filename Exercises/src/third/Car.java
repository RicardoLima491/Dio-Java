package third;

public class Car {
	 static Driver fiesta = new Driver();
		public static void main(String[] args) {	 
	 /*
	 System.out.println("marcha "+fiesta.getGear());
	 System.out.println("Velocidade "+fiesta.getSpeed());
	 System.out.println("Direção "+fiesta.getTurnLeftRight());
	 System.out.println("Ligado "+fiesta.isState());
	 */
	 state();
	 breaked();
	 turnOn();
	 checkGear();
	 accelerate();
		}
	private static void turnOn() {
		fiesta.setState(true);
		System.out.println("Carro Ligado!");
			
		}
	public static void state() {
		fiesta.setState(false);
		System.out.println("Carro Desligado!");
	}	

	public static void breaked() {
		fiesta.setSpeed(0);
		System.out.println("Velocidade atual: "+ fiesta.getSpeed());
	}	
	
	public static void checkGear() {
		fiesta.setGear(0);
		var gear = fiesta.getGear();
		if(gear == 0) {
			System.out.println("Carro em ponto morto");
			
		}else
		System.out.println("Carro está em : "+ fiesta.getGear()+ "ª marcha");
	}
	public static void accelerate() {
		fiesta.setSpeed(fiesta.getSpeed()+1);
		
	}	
	public static void turn() {
		fiesta.setTurnLeftRight(null);
	}
	public static void currentSpeed() {
		System.out.println(fiesta.getSpeed());
	 
	}

	
}