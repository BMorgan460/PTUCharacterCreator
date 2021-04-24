package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Miasma_Unleashed extends Feature {
	{
		name = "Miasma Unleashed";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You learn the moves Sludge Wave and Toxic.";
		prereqs.put("Miasmas Call", -1);
		prereqs.put("Guile", 6);
		prereqs.put("Stealth", 6);
	}
	public Miasma_Unleashed(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Miasmas Call") && t.checkSkillRank("Guile",6) && t.checkSkillRank("Stealth",6);
	}
}