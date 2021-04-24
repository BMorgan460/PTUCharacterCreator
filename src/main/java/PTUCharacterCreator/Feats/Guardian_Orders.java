package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Guardian_Orders extends Feature {
	{
		name = "Guardian Orders";
		tags = "";
		frequency = "Static";
		effect = "You gain the Brace for Impact and Sentinel Stance Orders.";
		prereqs.put("Charm", 5);
		prereqs.put("Intimidate", 5);
	}
	public Guardian_Orders(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",5) && t.checkSkillRank("Intimidate",5);
	}
}