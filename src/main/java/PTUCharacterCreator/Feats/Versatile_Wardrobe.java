package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Versatile_Wardrobe extends Feature {
	{
		name = "Versatile Wardrobe";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining Effect: The target loses 2 Tutor Points and then becomes Chic. Chic Pokemon gain two extra Held Item slots with which they can carry Held Items. However, the items in these slots have no effect and are not treated as equipped. As a Swift Action on their turn, Chic Pokemon may swap a currently active Held Item with an item stored in these slots. Chic Pokemon may not carry multiple items of the same type or with repeated effects.";
		prereqs.put("Fashionista", -1);
		prereqs.put("two Fashionista Skills at Adept", 0);
	}
	public Versatile_Wardrobe(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Command", "Guile", "Intimidate", "Intuition"};
		return t.hasFeat("Fashionista") && checkMultipleSkills(t,s,4,2);
	}
}