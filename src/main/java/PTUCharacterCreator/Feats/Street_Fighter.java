package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Street_Fighter extends Feature {
	{
		name = "Street Fighter";
		tags = "[+Attack]";
		frequency = "Static";
		effect = "You learn the Moves Assurance and Payback.";
		prereqs.put("Unexpected Attacks", -1);
		prereqs.put("two Rogue Skills at Expert Rank", 0);
	}
	public Street_Fighter(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Stealth", "Acrobatics", "Athletics"};
		return t.hasFeat("Unexpected Attacks") && checkMultipleSkills(t,s,5,2);
	}
}