package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Precision_Orders extends Feature {
	{
		name = "Precision Orders";
		tags = "";
		frequency = "Static";
		effect = "You gain the Pinpoint Strike and Perfect Aim Orders.";
		prereqs.put("Command", 5);
		prereqs.put("Perception", 5);
	}
	public Precision_Orders(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",5) && t.checkSkillRank("Perception",5);
	}
}