package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Incandescence extends Feature {
	{
		name = "Incandescence";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Trigger: Your Fire-Type Pokemon Effect: While this Feature is Bound, the target adds both their Attack and Special Attack Stat to all damaging Fire-Type Attacks, instead of one or the other. This does not stack with Twisted Power.";
		prereqs.put("Brightest Flame", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Incandescence(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Brightest Flame");
	}
}