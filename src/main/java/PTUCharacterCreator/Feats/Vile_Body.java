package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Vile_Body extends Feature {
	{
		name = "Vile Body";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "Choose Absorb Force, Poison Point, or Poison Touch. You gain the chosen Ability.";
		prereqs.put("Guile", 4);
		prereqs.put("Stealth", 4);
	}
	public Vile_Body(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Guile",4) && t.checkSkillRank("Stealth",4);
	}
}