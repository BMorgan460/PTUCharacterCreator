package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fey_Trance extends Feature {
	{
		name = "Fey Trance";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is bound, whenever the target uses a 1-Target Move with the Social Keyword or a Fairy-Type Status Move, the foe hit by the triggering Move becomes Infatuated with your Pokemon, and immediately Shifts towards your Pokemon, forfeiting their next Shift Action. This may affect a specific foe only once per Scene.";
		prereqs.put("Fairy Lights", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Fey_Trance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fairy Lights");
	}
}