package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sage extends Feature {
	{
		name = "Sage";
		tags = "[Class] [+HP]";
		frequency = "At-Will - Standard Action";
		effect = "Target: An ally within 5 meters Effect: The target gains Damage Reduction equal to your Occult Education Rank doubled or their Tick Value, whichever is higher, for one full round.";
		prereqs.put("Ocu Edu", 3);
	}
	public Sage(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",3);
	}
}