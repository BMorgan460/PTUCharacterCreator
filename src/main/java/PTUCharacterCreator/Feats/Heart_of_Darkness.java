package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Heart_of_Darkness extends Feature {
	{
		name = "Heart of Darkness";
		tags = "[+Attack or Special Attack]";
		frequency = "Static";
		effect = "You learn Night Daze and Punishment";
		prereqs.put("Sharpen Shadows", -1);
		prereqs.put("Guile", 6);
		prereqs.put("Stealth", 6);
	}
	public Heart_of_Darkness(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Sharpen Shadows") && t.checkSkillRank("Guile",6) && t.checkSkillRank("Stealth",6);
	}
}