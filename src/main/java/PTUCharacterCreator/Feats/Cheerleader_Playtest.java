package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Cheerleader_Playtest extends Feature {
	{
		name = "Cheerleader [Playtest]";
		tags = "[Class] [9-15 Playtest]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining Effect: Your Pokemon loses 2 Tutor Points and gains the Friend Guard Ability.";
		prereqs.put("Inspired Training", -1);
		prereqs.put("Charm", 3);
	}
	public Cheerleader_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Inspired Training") && t.checkSkillRank("Charm",3);
	}
}