package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Vanguard extends Ability {
	{
		name = "Vanguard";
		freq = "Static";
		effect = "Trigger: \nEffect: The user gains a +5 Bonus to all Damage Rolls against targets with an initiative lower than itself that have not yet acted that round (having Ante'd up your Action via an Interrupt or similar on a previous round does not count as having acted that round).";
	}
	public Vanguard(){}
}