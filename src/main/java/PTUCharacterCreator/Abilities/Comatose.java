package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Comatose extends Ability {
	{
		name = "Comatose";
		freq = "Static";
		effect = "Trigger: \nEffect: The user is always afflicted by Sleep status, and they cannot be awoken by any action or damage taken. The user can perform actions while asleep as if it were not asleep. If Burned, Poisoned, Badly Poisoned, or Paralyzed, it rolls 1d20 at the end of its turn. If the roll result is even, the user is cured of the status afflction.";
	}
	public Comatose(){}
}