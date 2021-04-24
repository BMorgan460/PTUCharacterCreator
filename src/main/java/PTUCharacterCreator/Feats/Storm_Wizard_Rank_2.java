package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Storm_Wizard_Rank_2 extends Feature {
	{
		name = "Storm Wizard Rank 2";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You may learn two Moves from the list below, marked with the Storm Wizard Rank you are gaining or lower. Rank 2 Moves: Charge, Thunder Punch, Thunderbolt";
		prereqs.put("Acrobatics", 5);
		prereqs.put("Focus", 5);
	}
	public Storm_Wizard_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",5) && t.checkSkillRank("Focus",5);
	}
}