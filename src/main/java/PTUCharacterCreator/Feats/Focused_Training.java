package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Focused_Training extends Feature {
	{
		name = "Focused Training";
		tags = "[Training][Orders]";
		frequency = "At-Will - Special";
		effect = "The target becomes Focused until the end of the effect duration. Focused Pokemon gain a +1 bonus to Accuracy Rolls and +2 to Skill Checks.";
		prereqs.put("Command", 3);
	}
	public Focused_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",3);
	}
}