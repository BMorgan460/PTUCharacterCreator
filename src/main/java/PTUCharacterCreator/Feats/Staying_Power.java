package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Staying_Power extends Feature {
	{
		name = "Staying Power";
		tags = "";
		frequency = "Scene - Free Action";
		effect = "Trigger: Your Pokemon Takes a Breather Effect: Your Pokemon may “Take a Breather” even if it is Confused or Enraged, and it does not Trip or have to Shift away from enemies as part of the action. You may choose whether or not your Pokemon resets their Combat Stages to default.";
		prereqs.put("Enduring Soul", -1);
	}
	public Staying_Power(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Enduring Soul");
	}
}