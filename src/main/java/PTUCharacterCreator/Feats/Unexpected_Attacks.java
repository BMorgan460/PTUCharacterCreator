package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Unexpected_Attacks extends Feature {
	{
		name = "Unexpected Attacks";
		tags = "[+Attack]";
		frequency = "Static";
		effect = "You learn the Moves Pursuit and Sucker Punch.";
		prereqs.put("Rogue", -1);
		prereqs.put("two Rogue Skills at Adept Rank", 0);
	}
	public Unexpected_Attacks(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		String[] s = {"Stealth", "Acrobatics", "Athletics"};
		return t.hasFeat("Rogue") && checkMultipleSkills(t,s,4,2);
	}
}