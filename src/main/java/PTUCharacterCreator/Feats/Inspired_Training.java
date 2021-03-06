package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Inspired_Training extends Feature {
	{
		name = "Inspired Training";
		tags = "[Training][Orders]";
		frequency = "At-Will - Special";
		effect = "The target becomes Inspired until the end of the effect duration. Inspired Pokemon gain a +1 bonus to Evasion and +2 to Save Checks.";
		prereqs.put("Charm", 3);
		prereqs.put("Command", 2);
	}
	public Inspired_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",3) && t.checkSkillRank("Command",2);
	}
}