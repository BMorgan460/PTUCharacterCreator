package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Sway extends Ability {
	{
		name = "Sway";
		freq = "Scene - Standard Action, Interrupt";
		effect = "Trigger: The user is hit by a damaging Melee Attack\nEffect: The triggering attack misses the user and hits the foe that made the attack instead. That foe may then be pushed to any empty square adjacent to the user.";
	}
	public Sway(){}
}