package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sharpen_Shadows extends Feature {
	{
		name = "Sharpen Shadows";
		tags = "[+Attack or Special Attack]";
		frequency = "Static";
		effect = "You learn Dark Pulse and Night Slash";
		prereqs.put("Shade Caller", -1);
		prereqs.put("Guile", 5);
		prereqs.put("Stealth", 5);
	}
	public Sharpen_Shadows(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Shade Caller") && t.checkSkillRank("Guile",5) && t.checkSkillRank("Stealth",5);
	}
}