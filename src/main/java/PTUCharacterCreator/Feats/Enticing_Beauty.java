package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Enticing_Beauty extends Feature {
	{
		name = "Enticing Beauty";
		tags = "";
		frequency = "Daily/10 - Free Action";
		effect = "Target: Your Pokemon The target acts as a Bait item as if it had the Alluring Capability. Add its number of Beauty Dice from Poffins as a Bonus to all d20 lure rolls.";
		prereqs.put("Beautiful Ballet Rank 1", -1);
	}
	public Enticing_Beauty(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Beautiful Ballet Rank 1");
	}
}