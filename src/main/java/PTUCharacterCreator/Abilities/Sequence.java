package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Sequence extends Ability {
	{
		name = "Sequence";
		freq = "Scene -  Free Action";
		effect = "Trigger: The user uses an Electric Attack\nEffect: For every allied Electric-Type Pokémon cardinally adjacent to the user, raise the user's Attack and Special Attack by +1 CS each before calculating damage for the triggering attack. After the attack is resolved, lose all Combat Stages gained this way.";
	}
	public Sequence(){}
}