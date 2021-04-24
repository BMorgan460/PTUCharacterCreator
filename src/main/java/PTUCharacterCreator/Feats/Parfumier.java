package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Parfumier extends Feature {
	{
		name = "Parfumier";
		tags = "";
		frequency = "Static";
		effect = "Whenever you create an Incense Held Item, choose Sweet Scent or Aromatic Mist. While your Pokemon is holding that Incense Item in an active Held Item slot, they add the chosen Move to their Move List. Recipe - Incense Maker";
		prereqs.put("Fashionista", -1);
		prereqs.put("one Fashionista Skill at Expert", 0);
	}
	public Parfumier(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Command", "Guile", "Intimidate", "Intuition"};
		return t.hasFeat("Fashionista") && checkMultipleSkills(t,s,5,1);
	}
}