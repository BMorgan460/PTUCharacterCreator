package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Shade_Caller extends Feature {
	{
		name = "Shade Caller";
		tags = "[Class] [+Attack or Special Attack]";
		frequency = "Static";
		effect = "You learn Faint Attack and Snarl.";
		prereqs.put("Elemental Connection (Dark)", 0);
		prereqs.put("Guile", 3);
		prereqs.put("Stealth", 3);
	}
	public Shade_Caller(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Guile",3) && t.checkSkillRank("Stealth",3);
	}
}