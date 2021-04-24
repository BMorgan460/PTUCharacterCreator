package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Kinjutsu extends Feature {
	{
		name = "Kinjutsu";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You learn the Moves Substitute and Toxic.";
		prereqs.put("Poison Weapons", 0);
		prereqs.put("Stealth", 6);
	}
	public Kinjutsu(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Stealth",6);
	}
}