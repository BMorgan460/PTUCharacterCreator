package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class CrossPollinate extends Feature {
	{
		name = "Cross-Pollinate";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Grass-Type Pokemon uses a damaging Grass-Type Move Effect: Your Pokemon may immediately use a Grass-Type Status-Class move as a Free Action.";
		prereqs.put("Foiling Foliage", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public CrossPollinate(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Foiling Foliage");
	}
}