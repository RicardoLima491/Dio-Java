package MusicPlayer;

import java.util.List;
import java.util.function.Function;

public class Lambda {

	public static void main(String[] ars) {
		List<User> user= List.of(new User ("ricardo", 42  ), new User("Victor", 18 ),
				new User("Henriquer", 7 ), new User("Miguel", 9 ));
		printStringValue(Record::toString, user);
	
	//	user.forEach(System.out::println);
		}
	private static void printStringValue(Function<User, String> callback, List<User> users) {
		users.forEach(u -> System.out.println(callback.apply(u)));
		
	}
	}

