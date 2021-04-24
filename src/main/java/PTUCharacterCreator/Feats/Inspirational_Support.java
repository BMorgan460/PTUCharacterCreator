package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Inspirational_Support extends Feature {
	{
		name = "Inspirational Support";
		tags = "";
		frequency = "Static";
		effect = "You may trigger Cheerleader as a Free Action when your Pokemon with Friend Guard activate an Ability or Status Move that affects only allies.";
		prereqs.put("Cheer Brigade", -1);
		prereqs.put("Charm", 4);
	}
	public Inspirational_Support(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Cheer Brigade") && t.checkSkillRank("Charm",4);
	}
}