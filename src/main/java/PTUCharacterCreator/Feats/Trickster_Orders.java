package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Trickster_Orders extends Feature {
	{
		name = "Trickster Orders";
		tags = "";
		frequency = "Static";
		effect = "You gain the Capricious Whirl and Dazzling Dervish Orders.";
		prereqs.put("Charm", 5);
		prereqs.put("Guile", 5);
	}
	public Trickster_Orders(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",5) && t.checkSkillRank("Guile",5);
	}
}