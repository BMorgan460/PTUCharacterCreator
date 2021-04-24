package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Incandescence_Playtest extends Feature {
	{
		name = "Incandescence [Playtest]";
		tags = "[Orders] [Stratagem] [9-15 Playtest]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Trigger: Your Fire-Type Pokemon Effect: While this Feature is Bound, the target gains the Mixed Power Poke Edge effect when using damaging Fire-Type Attacks. If the target already has Mixed Power, they instead add their entire Attack and Special Attack Stats to all damaging Fire-Type Attacks, instead of one or the other. This does not stack with Twisted Power.";
		prereqs.put("Brightest Flame", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Incandescence_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Brightest Flame");
	}
}