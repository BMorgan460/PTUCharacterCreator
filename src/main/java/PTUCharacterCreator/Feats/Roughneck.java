package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Roughneck extends Feature {
	{
		name = "Roughneck";
		tags = "[Class][+Defense]";
		frequency = "1 AP - Swift Action";
		effect = "Trigger: You hit a foe with an Attack Effect: The foe loses a Combat Stage in the Stat of your choice.";
		prereqs.put("Athletics", 3);
		prereqs.put("Intimidating Presence", -3);
	}
	public Roughneck(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",3) && t.hasEdge("Intimidating Presence");
	}
}