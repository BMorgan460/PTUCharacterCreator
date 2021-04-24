package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Soothing_Connection extends Feature {
	{
		name = "Soothing Connection";
		tags = "";
		frequency = "Daily x2 - Standard Action";
		effect = "Target: Channeled Pokemon Effect: Distribute 5 points in any way among Pokemon you are Channeling. For each point you assign to a Channeled Pokemon, they gain a Tick of Hit Points.";
		prereqs.put("Pain Dampening", -1);
		prereqs.put("Intuition", 6);
	}
	public Soothing_Connection(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Pain Dampening") && t.checkSkillRank("Intuition",6);
	}
}