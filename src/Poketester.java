import java.util.Scanner;

public class Poketester {

	public static void main(String[] args) {
		
		
		AttackCalc typeAdvantageFinder = new AttackCalc();
		
//		double random = typeAdvantageFinder.getrandomVal();
//		
//		AttackCalc damageTester = new AttackCalc(89, 90, 100000, typeAdvantageFinder.typeAdvantageCalc("flying", "grass"), 1, 17, 1.5, random, 1, 1);
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is the type of the move?");
		String type1 = scanner.nextLine();
		System.out.println("what is the type(s) of the pokemon?(indicate a second type by typing space and the second type)");
		String type2 = scanner.nextLine();
		
		double typeAd = typeAdvantageFinder.typeAdvantageCalc("dragon", "water");
		System.out.println(typeAd);
		
//		double damage = Math.round(damageTester.getDamage());
//		
//		System.out.println(damage);
//		
//		System.out.println(random);
//		
		
	}
	

}
