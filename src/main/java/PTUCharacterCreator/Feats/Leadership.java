package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Leadership extends Feature {
	{
		name = "Leadership";
		tags = "";
		frequency = "Static";
		effect = "You may use [Orders] that have targets to target any Ally, even if normally those [Orders] would only let you apply the effect to your own Pokemon. Any other conditions still apply.";
		prereqs.put("Commander", -1);
	}
	public Leadership(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Commander");
	}
}