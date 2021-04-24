package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Telekinetic_Burst extends Feature {
	{
		name = "Telekinetic Burst";
		tags = "[+Special Attack]";
		frequency = "2 AP - Swift Action";
		effect = "You perform a Disarm, Trip, or Push Maneuver using your Telekinetic Capability.";
		prereqs.put("PK Omega", -1);
		prereqs.put("Focus", 6);
	}
	public Telekinetic_Burst(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("PK Omega") && t.checkSkillRank("Focus",6);
	}
}