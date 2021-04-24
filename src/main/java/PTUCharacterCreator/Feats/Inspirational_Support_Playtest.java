package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Inspirational_Support_Playtest extends Feature {
	{
		name = "Inspirational Support [Playtest]";
		tags = "[9-15 Playtest]";
		frequency = "Static";
		effect = "Whenever your Pokemon with Friend Guard targets an Ally with an Ability or Status Move, the targeted Ally becomes Cheered.";
		prereqs.put("Cheers [Playtest]", -1);
		prereqs.put("Charm", 4);
	}
	public Inspirational_Support_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Cheers [Playtest]") && t.checkSkillRank("Charm",4);
	}
}