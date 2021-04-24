package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Commanders_Voice extends Feature {
	{
		name = "Commander's Voice";
		tags = "";
		frequency = "Static";
		effect = "You may give two different [Orders] as a single Standard Action, or you may give one set of [Orders] as a Swift Action. Special: If this is used to use Focused Command and another [Order] that has targets, the second Order applies to both Pokemon you are commanding that turn. Commanders Voice doesnt allow you to use Focused Command as a Swift Action.";
		prereqs.put("Two Features with the [Orders] tag", 0);
	}
	public Commanders_Voice(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}