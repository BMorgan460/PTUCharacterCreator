package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Instant_Analysis extends Feature {
	{
		name = "Instant Analysis";
		tags = "[General Research Field] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining Effect: Your Pokemon loses 2 Tutor Points and gains the Forewarn Ability.";
		prereqs.put("Gen Edu", 5);
	}
	public Instant_Analysis(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",5);
	}
}