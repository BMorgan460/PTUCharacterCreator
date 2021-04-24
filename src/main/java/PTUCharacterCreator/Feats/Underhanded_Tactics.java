package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Underhanded_Tactics extends Feature {
	{
		name = "Underhanded Tactics";
		tags = "[+Attack]";
		frequency = "Static";
		effect = "You gain your choice of Ambush or Cruelty.";
		prereqs.put("Rogue", -1);
		prereqs.put("a Rogue Skill at Expert Rank", 0);
	}
	public Underhanded_Tactics(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		String[] s = {"Stealth", "Acrobatics", "Athletics"};
		return t.hasFeat("Rogue") && checkMultipleSkills(t,s,5,1);
	}
}