package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Ravager_Orders extends Feature {
	{
		name = "Ravager Orders";
		tags = "";
		frequency = "Static";
		effect = "You gain the Reckless Advance and Strike Again! Orders.";
		prereqs.put("Command", 5);
		prereqs.put("Intimidate", 5);
	}
	public Ravager_Orders(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",5) && t.checkSkillRank("Intimidate",5);
	}
}