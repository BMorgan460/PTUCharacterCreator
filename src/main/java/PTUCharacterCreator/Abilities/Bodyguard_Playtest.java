package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Bodyguard_Playtest extends Ability {
	{
		name = "Bodyguard [Playtest]";
		freq = "Scene x2 - Free Action";
		effect = "Trigger: An adjacent Ally is hit by an attack\nEffect: The user and the triggering Ally switch places, and the user becomes the target of the triggering attack instead, taking damage from the attack as if resisted one step further. If switching places would not move the triggering Ally out of the area-of-effect of a Burst, Blast, Cone, or Line, this Ability does not prevent the ally from being hit. Defensive.";
	}
	public Bodyguard_Playtest(){}
}