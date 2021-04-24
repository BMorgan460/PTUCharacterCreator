package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Close_Quarters_Mastery extends Feature {
	{
		name = "Close Quarters Mastery";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is Bound, the targets Fighting-Type Moves cause foes to become Marked by the target for 1 full round. If the target is a Fighting- Type Pokemon, they may also Mark the Foe for one full round when hitting with a Grapple, Trip, or Push Maneuver.  Note: Marked Foes provoke an attack of Opportunity from the Pokemon that marked them if they Shift out of an adjacent square into a square that is not adjacent, even if they use a Disengage Maneuver. Targets cannot be Marked by more than one Pokemon at a time.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Fighting as Chosen Type", 0);
	}
	public Close_Quarters_Mastery(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}