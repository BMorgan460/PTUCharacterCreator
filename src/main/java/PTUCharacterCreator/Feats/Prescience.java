package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Prescience extends Feature {
	{
		name = "Prescience";
		tags = "[+Special Defense]";
		frequency = "Scene - Free Action ";
		effect = "Trigger: You are hit by an attack Effect: The attack instead misses.";
		prereqs.put("Unveiled Sight", -1);
		prereqs.put("Perception", 6);
	}
	public Prescience(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Unveiled Sight") && t.checkSkillRank("Perception",6);
	}
}