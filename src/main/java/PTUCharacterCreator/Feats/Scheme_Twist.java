package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Scheme_Twist extends Feature {
	{
		name = "Scheme Twist";
		tags = "";
		frequency = "Scene x2 - Swift Action";
		effect = "Trigger: You give [Orders] with a Daily or Scene Frequency that have Targets. Effect: You may target up to two additional Allies with the [Orders].";
		prereqs.put("Commander", -1);
		prereqs.put("Command", 6);
	}
	public Scheme_Twist(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Commander") && t.checkSkillRank("Command",6);
	}
}