package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Weeble extends Ability {
	{
		name = "Weeble";
		freq = "At-Will - Standard Action, Reaction";
		effect = "Trigger: The user is hit by a damaging attack\nEffect: The user may make an AC4 Physical Attack against an adjacent target. If the attack hits, the target loses Hit Points equal to 1/3rd of the damage taken by the user from the attack that triggered Weeble.";
	}
	public Weeble(){}
}