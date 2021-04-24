package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Oracle extends Feature {
	{
		name = "Oracle";
		tags = "[Class][+Special Defense]";
		frequency = "Static";
		effect = "You gain the Pickup Ability.";
		prereqs.put("Mystic Senses", -3);
		prereqs.put("Perception", 3);
	}
	public Oracle(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Mystic Senses") && t.checkSkillRank("Perception",3);
	}
}