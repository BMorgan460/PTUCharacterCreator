package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Malediction extends Feature {
	{
		name = "Malediction";
		tags = "[+HP]";
		frequency = "Scene x2 - Free Action ";
		effect = "Trigger: A foe within 5 meters misses all targets with an attack Effect: Use a Status-Class Move gained from Hex Maniac Studies targeting the triggering foe as a Free Action, Frequency-permitting.";
		prereqs.put("Hex Maniax Studies Rank 1", 0);
		prereqs.put("Ocu Edu", 5);
	}
	public Malediction(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",5);
	}
}