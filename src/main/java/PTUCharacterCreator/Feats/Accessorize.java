package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Accessorize extends Feature {
	{
		name = "Accessorize";
		tags = "";
		frequency = "Static";
		effect = "You may wear and benefit from two Accessory Slot Items at once. The two items must be of different types and must not share an effect. For example, a Fire Brace cannot be paired with another Fire Brace or a Fire Plate, but it could be paired with an Ice Brace, a Fire Booster, or a Stat Booster.";
		prereqs.put("Dashing Makeover", -1);
		prereqs.put("one Fashionista Skill at Adept", 0);
	}
	public Accessorize(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Command", "Guile", "Intimidate", "Intuition"};
		return t.hasFeat("Dashing Makeover") && checkMultipleSkills(t,s,4,1);
	}
}