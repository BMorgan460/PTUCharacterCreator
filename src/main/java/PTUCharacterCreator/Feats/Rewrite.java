package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Rewrite extends Feature {
	{
		name = "Rewrite";
		tags = "[+Attack or Special Attack]";
		frequency = "Daily";
		effect = "Target: Self or a willing Pokemon with Hidden Power. Effect: Reroll the Type for an instance of Hidden Power the target knows If you target an Unown, you may transform the target into a different letter.";
		prereqs.put("Hidden Power", -1);
	}
	public Rewrite(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hidden Power");
	}
}