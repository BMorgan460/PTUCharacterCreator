package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Gleeful_Interference extends Feature {
	{
		name = "Gleeful Interference";
		tags = "";
		frequency = "1 AP - Free Action";
		effect = "Trigger: Your Pokemon with the Friend Guard Ability hits a foe with a damaging attack Effect: The triggering foe gains a -2 penalty to Accuracy for one full Round.";
		prereqs.put("Cheer Brigade", -1);
		prereqs.put("Charm", 4);
	}
	public Gleeful_Interference(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Cheer Brigade") && t.checkSkillRank("Charm",4);
	}
}