package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class True_Steel extends Feature {
	{
		name = "True Steel";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Steel-Type Pokemon is hit by a damaging attack Effect: Your Pokemon gains Damage Reduction against the attack equal to your Type-Linked Skill Rank. Additionally, calculate Type Effectiveness with this attack as if your Pokemon has no Typings besides Steel.";
		prereqs.put("Polished Shine", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public True_Steel(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Polished Shine");
	}
}