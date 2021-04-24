package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Miasmas_Call extends Feature {
	{
		name = "Miasmas Call";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You learn the moves Acid Armor and Sludge Bomb.";
		prereqs.put("Vile Body", -1);
		prereqs.put("Guile", 5);
		prereqs.put("Stealth", 5);
	}
	public Miasmas_Call(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Vile Body") && t.checkSkillRank("Guile",5) && t.checkSkillRank("Stealth",5);
	}
}