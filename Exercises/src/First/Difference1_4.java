package First;

import java.util.Scanner;

public class Difference1_4{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person person1 = new Person();
		System.out.println("Digite o nome da primeira pessoa: ");
		person1.setName(scan.next());
		System.out.println("Digite a idade da primeira pessoa: ");
		person1.setAge(scan.nextInt());
		//System.out.println(person1.getName() + person1.getAge()); 
		
		Person person2 = new Person();
		System.out.println("Digite o nome da segunda pessoa: ");
		person2.setName(scan.next());
		System.out.println("Digite a idade da segunda pessoa: ");
		person2.setAge(scan.nextInt());
		//System.out.println(person2.getName() + person2.getAge()); 
		
		if (person1.getAge() > person2.getAge()) {
			System.out.println(person1.getName()+" é "+
					(person1.getAge() - person2.getAge())+
					" ano(S) mais velho(a) que "+ person2.getName());
		}
		else if (person2.getAge() > person1.getAge()){
			System.out.println(person2.getName()+" é "+
					(person2.getAge() - person1.getAge())+
					" ano(S) mais velho(a) que "+ person1.getName());
		}
		else if (person1.getAge() == person2.getAge()) {
			System.out.println(person1.getName()+" e "+ person2.getName()+" tem a mesma idade. ");
		}

	}
	
	
	
}
	