package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Winters_Herald_Rank_1 extends Feature {
	{
		name = "Winters Herald Rank 1";
		tags = "[Ranked 2] [+Attack or Special Attack]";
		frequency = "Static";
		effect = "You may learn two Moves from the list below. Rank 1 Moves: Freeze-Dry, Ice Punch, Ice Beam, Icicle Crash";
		prereqs.put("Athletics", 5);
		prereqs.put("Survival", 5);
	}
	public Winters_Herald_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",5) && t.checkSkillRank("Survival",5);
	}
}