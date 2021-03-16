package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Perception extends Ability {
	{
		name = "Perception";
		freq = "At-Will - Shift Action, Interrupt";
		effect = "Trigger: An ally uses an area-of-effect attack that would hit you\nEffect: You may Shift to remove yourself from the area-of-effect.";
	}
	public Perception(){}
}