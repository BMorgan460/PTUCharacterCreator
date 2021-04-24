package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Overload extends Feature {
	{
		name = "Overload";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is Bound, whenever the target hits a foe with an Electric Attack, they may choose to have the foe lose Hit Points equal to the targets Tick value plus your Type-Linked Skill Rank. If they do, the target loses a Tick of Hit Points after the attack is resolved.";
		prereqs.put("Lockdown", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Overload(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Lockdown");
	}
}