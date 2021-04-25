package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Telekinesis extends Move {
	{
		name = "Telekinesis";
		effect = "The target becomes Lifted. While Lifted, they gain the Levitate Ability, are Slowed, and lose all Movement Capabilities except for the Levitate 4 granted by Levitate (reduced to 2 by the Slow condition). While Lifted, the user may not apply any Evasion bonuses to determine whether they are hit by Moves or not. The Lifted target may use a Shift Action to roll 1d20, on a result of 16+, they stop being Lifted. *Grants Telekinetic";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "4, 1 Target";
		type = "Psychic";
		category = "Status";
	}
	public Telekinesis(){}
}