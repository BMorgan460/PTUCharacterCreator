package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Storm_Wizard_Rank_3 extends Feature {
	{
		name = "Storm Wizard Rank 3";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You may learn two Moves from the list below, marked with the Storm Wizard Rank you are gaining or lower. Rank 3 Moves: Discharge, Thunder, Thunder Wave, Volt Tackle";
		prereqs.put("Acrobatics", 6);
		prereqs.put("Focus", 6);
	}
	public Storm_Wizard_Rank_3(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",6) && t.checkSkillRank("Focus",6);
	}
}