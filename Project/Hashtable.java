import java.util.Scanner;

public class Hashtable {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String[] Hashtable = {"Natividad, Michael Angelo", "Abella, Justine Nica", "Hermosura, Jonnah","Mercado, Jul Seth Mari","Torres, Gavin Kyle","Par, Mike Vincent Luis",
				"Tanghal, J-Rhyzz", "Lalo, Kean","Pagarigan, Jeremiahz","Cinco, Brandon Kenneth","Pineda, Rizjake Jaime","Estimadora, Jhon Texter","Guansing, Ivan","Dapitillo, Kean John",
				"Bantegui, Moses Christian","Masangcay, Jenina Velle","Victoria, Elaine Grace","Aranilla, Idel Lawrence","Tenerife, Tristan Angelo","Calalang, Victor Vinnie Lars","Bolanos, Jap","Adia, Ronn"
			, "John Matthew Banto","Monte de Ramos, Mariel","Papina, Marianne Jovi","Verzosa, Luis Miguel","Du, Alexander John","Jean Angelo Flores","Legaspi, Carlos",
			"Masangcay, John Christian","Gonzales, Marvin John","Almocera, Alliyah","Saavedra, Vincent Paul","Rifarial, Neil","Vargas, Jethro Ruiz",
			"Paller, Richael","Jalalon, James Francis","Valencia, Jamil","Bablis, Winna Janen","Ma. Teresa Jesmari Erl Labon", " "};
		System.out.print("Name  to search on section INF214: ");
		String search = s.nextLine();
		
		int i = 0;
		
		while(i < Hashtable.length) {
			
			if(Hashtable[i].equalsIgnoreCase(search)) {
				System.out.println("Hello! " + Hashtable[i]);
				System.out.println("We found " + Hashtable[i] + "  our blockmates");
				break;
			} else {
				System.out.println(Hashtable[i]);
			}
				i++;
			}
		}
			
	}
		
		
		
		
		
		
		
		
		
		
		
