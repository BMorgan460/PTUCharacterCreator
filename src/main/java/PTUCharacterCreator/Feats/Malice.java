package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Malice extends Feature {
	{
		name = "Malice";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You learn the Moves Mean Look and Chip Away.";
		prereqs.put("Roughneck", -1);
		prereqs.put("Intimidate", 4);
	}
	public Malice(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Roughneck") && t.checkSkillRank("Intimidate",4);
	}
}