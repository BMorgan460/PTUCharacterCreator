package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Live_and_Learn extends Feature {
	{
		name = "Live and Learn";
		tags = "[General Research Field] [Branch]";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: You or your Pokemon miss with an attack, fail a Skill Check, or fail a Save Check Effect: Add half of your General Education Rank to the next roll of the same type that the triggering user makes.";
		prereqs.put("Gen Edu", 4);
	}
	public Live_and_Learn(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",4);
	}
}