package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Tough_as_Nails extends Feature {
	{
		name = "Tough as Nails";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You learn the Moves Endure and Slack Off.";
		prereqs.put("3 Roughneck Features", 0);
		prereqs.put("Intimidate", 6);
	}
	public Tough_as_Nails(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intimidate",6);
	}
}