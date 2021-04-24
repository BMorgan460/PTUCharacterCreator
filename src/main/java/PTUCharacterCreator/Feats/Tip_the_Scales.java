package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Tip_the_Scales extends Feature {
	{
		name = "Tip the Scales";
		tags = "";
		frequency = "2 AP - Swift Action";
		effect = "Trigger: You give [Orders] that have targets. Effect: Your [Orders] with an At-Will Frequency instead target all allies within 10 Meters.";
		prereqs.put("Commander", -1);
		prereqs.put("Command", 5);
	}
	public Tip_the_Scales(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Commander") && t.checkSkillRank("Command",5);
	}
}