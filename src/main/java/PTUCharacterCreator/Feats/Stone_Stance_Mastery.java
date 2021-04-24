package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Stone_Stance_Mastery extends Feature {
	{
		name = "Stone Stance Mastery";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "Whenever you bind Stone Stance, you may choose two Stances and apply the effects of both.";
		prereqs.put("Stone Stance", -1);
		prereqs.put("Combat", 6);
		prereqs.put("Survival", 6);
	}
	public Stone_Stance_Mastery(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Stone Stance") && t.checkSkillRank("Combat",6) && t.checkSkillRank("Survival",6);
	}
}