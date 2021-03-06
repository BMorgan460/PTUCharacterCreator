package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Herb_Lore extends Feature {
	{
		name = "Herb Lore";
		tags = "[Botany Research Field] [Branch]";
		frequency = "Static";
		effect = "You may create Energy Powder, Heal Powder, or Poultices from ingredients, as listed below. ?? Energy Powder: A Sitrus Berry or Tiny Mushroom creates x2 Energy Powders. An Energy Root creates x3 Energy Powders. ?? Heal Powder: A Lum Berry or Big Mushroom creates x2 Heal Powders. A Revival Herb creates x3 Heal Powders ?? Poultice: x1 Energy Powder and x1 Heal Powder create x3 Poultices.";
		prereqs.put("Seed Bag Rank 1", -1);
	}
	public Herb_Lore(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Seed Bag Rank 1");
	}
}