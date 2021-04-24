package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Upheaval extends Feature {
	{
		name = "Upheaval";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Pokemon uses the Groundshaper Capability, or a Move with the Groundsource keyword Effect: Your Pokemon may make a Trip Attempt as a Free Action against any Pokemon targeted by the Move, or standing on a square changed by the Groundshaper capability. Your Pokemon gains a bonus to their Combat Roll equal to half of your Type-Linked Skill Rank.";
		prereqs.put("Mold the Earth", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Upheaval(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Mold the Earth");
	}
}