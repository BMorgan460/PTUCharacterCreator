package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Learn_From_Your_Mistakes extends Feature {
	{
		name = "Learn From Your Mistakes";
		tags = "";
		frequency = "Daily/5 - Free Action";
		effect = "Trigger: Your Pokemon fails a Skill Check:   Your Pokemon may re-roll the Skill Check with a Bonus equal to its number of Smart Dice from Poffins.";
		prereqs.put("Smart Scheme Rank 1", -1);
	}
	public Learn_From_Your_Mistakes(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Smart Scheme Rank 1");
	}
}