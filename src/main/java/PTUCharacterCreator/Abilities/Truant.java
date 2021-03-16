package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Truant extends Ability {
	{
		name = "Truant";
		freq = "Static";
		effect = "Trigger: \nEffect: At the beginning of each of its turns, the user must roll 1d20. On a roll of 7 or lower, the target refuses to act, they heal a Tick of Hit Points, and do not get a Standard Action that turn. Turns in which the user refuses to act count towards turns used up by Interrupts or the Exhausted Condition, and the user may make Rolls to cure themselves from Status Effects with a +3 Bonus that turn.";
	}
	public Truant(){}
}