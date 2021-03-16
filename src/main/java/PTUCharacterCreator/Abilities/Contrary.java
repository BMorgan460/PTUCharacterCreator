package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Contrary extends Ability {
	{
		name = "Contrary";
		freq = "Static";
		effect = "Trigger: \nEffect: If something would raise the user's Combat Stages, it instead lowers the user's Combat Stages by the same amount. If something would lower the user's Combat Stages, it instead raises the user's Combat Stages by the same amount.";
	}
	public Contrary(){}
}