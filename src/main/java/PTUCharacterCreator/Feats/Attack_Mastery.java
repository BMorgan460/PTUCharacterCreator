package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Attack_Mastery extends Feature {
	{
		name = "Attack Mastery";
		tags = "[Branch]";
		frequency = "Static";
		effect = "When your Pokemon successfully uses a Push, Disarm, or Dirty Trick Combat Maneuver, the target of the Maneuver loses a Tick of Hit Points.";
		prereqs.put("Attack Maneuver", -1);
	}
	public Attack_Mastery(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Attack Maneuver");
	}
}