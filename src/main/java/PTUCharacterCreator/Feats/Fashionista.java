package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fashionista extends Feature {
	{
		name = "Fashionista";
		tags = "[Class]";
		frequency = "At-Will - Extended Action";
		effect = "You may craft any Fashionista Recipe for which you qualify.  Special: When you take Fashionista, choose two of Charm, Command, Guile, Intimidate, or Intuition to become your Fashionista Skills. The Skills you choose must be at Novice Rank or higher. Recipes - Contest Trends, Adorable Fashion(Charm), Elegant Fashion(Intuition), Rad Fashion(Command), Rough Fashion(Intimidate), Slick Fashion(Guile)";
		prereqs.put("Charm, Command, Guile, Intimidate, or Intuition", 3);
	}
	public Fashionista(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Command", "Guile", "Intimidate", "Intuition"};
            return checkMultipleSkills(t,s,3,2);
	}
}