package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Moody extends Ability {
	{
		name = "Moody";
		freq = "At-Will - Free Action";
		effect = "Trigger: The user joins an encounter, misses with a Move, or hurts itself in Confusion\nEffect: Moody must be activated whenever it is triggered. Roll 1d10 to determine a Stat to be raised by +2 Combat Stages, then roll 1d10 to determine a Stat to be lower 2 Combat Stages. 1 or 2 is Attack, 3 or 4 is Defense, 5 or 6 is Special Attack, 7 or 8 is Special Defense, 9 or 10 is Speed.";
	}
	public Moody(){}
}