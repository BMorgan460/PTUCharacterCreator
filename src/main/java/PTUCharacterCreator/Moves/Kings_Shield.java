package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Kings_Shield extends Move {
	{
		name = "King's Shield";
		effect = " If the user is hit by an attack, the user may use King’s Shield. The user is instead not hit by the Move. You do not take any damage nor are you affected by any of the Move’s effects. In addition, if the triggering attack was Melee ranged, the attacker’s Attack is lowered by -2 CS.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = " Self, Interrupt, Shield, Trigger";
		type = "Steel";
		category = "Status";
	}
	public Kings_Shield(){}
}