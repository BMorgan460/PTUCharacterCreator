package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Charge extends Move {
	{
		name = "Charge";
		effect = "If the user performs an Electric Attack on its next turn, add its Damage Dice Roll an extra time to the damage. Raise the user's Special Defense by +1 CS.";
		damageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Self";
		type = "Electric";
		category = "Status";
	}
	public Charge(){}
}