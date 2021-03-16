package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Wash_Away extends Ability {
	{
		name = "Wash Away";
		freq = "Daily - Free Action";
		effect = "Trigger: The user hits with a Water Type Move\nEffect: Before the Move hits, all Combat Stages on targets hit by the Move are reset to their default (usually 0), and all coats on the targets, except ones placed by Water Sport, are destroyed.";
	}
	public Wash_Away(){}
}