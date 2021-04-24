package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Blur extends Feature {
	{
		name = "Blur";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "Attacks and Moves targeting you that dont require an Accuracy Check now require one, as though they had Accuracy Check of 2. You may only apply half of your Evasion to these Attacks and Moves.";
		prereqs.put("Acrobatics", 5);
		prereqs.put("Stealth", 5);
	}
	public Blur(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",5) && t.checkSkillRank("Stealth",5);
	}
}