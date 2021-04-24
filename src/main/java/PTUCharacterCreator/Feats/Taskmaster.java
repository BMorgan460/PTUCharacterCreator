package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Taskmaster extends Feature {
	{
		name = "Taskmaster";
		tags = "[Class]";
		frequency = "At-Will - Free Action";
		effect = "Trigger: You apply Brutal Training as a Training action Effect: You may grant your Pokemon up to three injuries. If your Pokemon has at least one Injury, it becomes Hardened.  See Extras - Class Mechanics for Hardened details.";
		prereqs.put("Brutal Training", -1);
		prereqs.put("Intimidate", 3);
	}
	public Taskmaster(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Brutal Training") && t.checkSkillRank("Intimidate",3);
	}
}