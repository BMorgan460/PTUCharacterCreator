package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Marksman_Orders extends Feature {
	{
		name = "Marksman Orders";
		tags = "";
		frequency = "Static";
		effect = "You gain the Trick Shot and Long Shot Orders.";
		prereqs.put("Guile", 5);
		prereqs.put("Perception", 5);
	}
	public Marksman_Orders(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Guile",5) && t.checkSkillRank("Perception",5);
	}
}