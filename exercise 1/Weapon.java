public class Weapon {
	
	
	int damage;
	int weight;
	String skills;
	String rarity;
	String name;
	String description;
	
	//public void weaponDescription() {
	// System.out.println("Never back down or prepare for destruction " + name + " and I deal " + damage + "My weight is " + weight);
	
	 public void weaponName() {
	        System.out.println("Name: " + name);
	}
	 public void weaponDamage() {
	        System.out.println("Damage: " + damage);
	        
	        
	}
	 public void weaponWeight() {
	        System.out.println("Weight: " + weight);
	        
	        
	}
	 
	public void weaponSkills() {
		    System.out.println("Skills: " + skills );
	}
	public void weaponRarity() {
	        System.out.println("rarity: " + rarity );
	    
	}
	    
    public void weaponDescription1() {
	       System.out.println( description + "Never back down or prepare for destruction " + "My name is " + name + " and I deal " + damage + " damage" +  " My weight is " + weight);
}
    public void weaponDescription2() {
	       System.out.println( description + "Words are meaningless, now talk with your fists! " + "My name is " + name + " and I deal " + damage + " damage" + " My weight is " + weight);
}
    public void weaponDescription3() {
	       System.out.println( description + "A true hero has come to help " + "My name is " + name + " and I deal " + damage + " damage" + " My weight is " + weight);
}
}
