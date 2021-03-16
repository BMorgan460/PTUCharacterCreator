package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Moody_Playtest extends Ability {
	{
		name = "Moody [Playtest]";
		freq = "Static";
		effect = "Trigger: \nEffect: At the end of the user's turn, roll 1d6 to determine a Stat to be raised by +2 Combat Stages, then roll 1d6 to determine a Stat to be lowered by 1 Combat Stage. 1 is Attack, 2 is Defense, 3 is Special Attack, 4 is Special Defense, 5 is Speed, and 6 is Accuracy.";
	}
	public Moody_Playtest(){}
}