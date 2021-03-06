package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Celerity extends Feature {
	{
		name = "Celerity";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: A Flying-Type Pokemon, or a Pokemon with a Sky or Levitate Speed Effect: While this Feature is Bound, add your Type-Linked Skill to the targets Initiative. Additionally, if the Target uses a Disengage Maneuver, they may Shift as if Slowed instead of shifting only 1 Meter.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Flying as Chosen Type", 0);
	}
	public Celerity(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}