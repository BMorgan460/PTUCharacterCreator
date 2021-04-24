package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Champ_in_the_Making extends Feature {
	{
		name = "Champ in the Making";
		tags = "";
		frequency = "Drain 1 AP - Free Action";
		effect = "Trigger: You use Ace Trainer to give Pokemon Trained Stats Effect: Choose two Trained Stats for each Pokemon instead of one. A Pokemon may only have two Trained Stats this way.";
		prereqs.put("4 Ace Trainer Features", 0);
		prereqs.put("Command", 6);
	}
	public Champ_in_the_Making(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",6) && t.hasFeat("Ace Trainer");
	}
}