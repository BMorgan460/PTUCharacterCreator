package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Endurance extends Feature {
	{
		name = "Endurance";
		tags = "";
		frequency = "Daily/10 - Free Action";
		effect = "Trigger: Your Pokemon takes falling damage, begins to suffocate, or is Heavily Injured:   Your Pokemon can ignore up to X meters of falling when calculating falling damage, act without beginning to suffocate for X additional rounds, or ignore the Hit Point loss effects from acting while Heavily Injured for X rounds. X is equal to half its number of Tough Dice from Poffins.";
		prereqs.put("Tough Tumble Rank 1", -1);
	}
	public Endurance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Tough Tumble Rank 1");
	}
}