package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Vim_and_Vigor extends Feature {
	{
		name = "Vim and Vigor";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points Effect: You spend an hour with the target. The target loses 2 Tutor Points, and gains the Vigor Ability. Vim and Vigor may target a Pokemon only once";
		prereqs.put("Shrug Off", -1);
		prereqs.put("Athletics", 6);
		prereqs.put("Focus", 6);
	}
	public Vim_and_Vigor(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Shrug Off") && t.checkSkillRank("Athletics",6) && t.checkSkillRank("Focus",6);
	}
}