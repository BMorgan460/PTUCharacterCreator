package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Bodyguard extends Ability {
	{
		name = "Bodyguard";
		freq = "Scene -  Free Action";
		effect = "Trigger: A cardinally adjacent Ally is hit by an attack\nEffect: The user and the target switch places, and the user becomes the target of the attack instead, taking damage from the attack as if resisted one step further. If switching places would not move the triggering Ally out of the area-of-effect of a Burst, Blast, Cone, or Line, this Ability does not prevent the ally from being hit. Defensive.";
	}
	public Bodyguard(){}
}