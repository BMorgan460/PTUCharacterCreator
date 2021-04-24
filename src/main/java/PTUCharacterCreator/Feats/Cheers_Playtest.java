package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Cheers_Playtest extends Feature {
	{
		name = "Cheers [Playtest]";
		tags = "[9-15 Playtest]";
		frequency = "X AP - Swift Action";
		effect = "Trigger: You use [Orders] Effect: The target or targets of the triggering [Orders] are Cheered for 1 full round. While Cheered, the targets Combat Stages cannot be lowered by foes attacks, features, or abilities. This Feature costs 0 AP if the triggering effect affects only one ally, and costs 1 AP if it affects two or more.";
		prereqs.put("Cheerleader [Playtest]", -1);
	}
	public Cheers_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Cheerleader [Playtest]");
	}
}