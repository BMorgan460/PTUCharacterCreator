package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Focus_Punch extends Move {
	{
		name = "Focus Punch";
		effect = "Use of Focus Punch must be declared as a Priority (Limited) action at the beginning of the round. Nothing happens at this time. At the end of the round, if the target hasn't been hit by an attack dealing damage equal to at least 25% of the user's Maximum Hit Points, the user may Shift and use Focus Punch. Focus Punch's Frequency is not expended if it is negated by an attack.";
		damageBase = 15;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Priority (Limited), Aura";
		type = "Fighting";
		category = "Physical";
	}
	public Focus_Punch(){}
}