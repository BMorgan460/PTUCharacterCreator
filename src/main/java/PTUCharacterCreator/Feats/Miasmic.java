package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Miasmic extends Feature {
	{
		name = "Miasmic";
		tags = "[Class] [+Defense]";
		frequency = "Static";
		effect = "You learn the Moves Acid and Clear Smog.";
		prereqs.put("Elemental Connection (Poison)", 0);
		prereqs.put("Stealth", 3);
		prereqs.put("Guile", 3);
	}
	public Miasmic(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Stealth",3) && t.checkSkillRank("Guile",3);
	}
}