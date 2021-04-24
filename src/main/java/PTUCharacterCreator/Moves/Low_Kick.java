package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Low_Kick extends Move {
	{
		name = "Low Kick";
		effect = "Low Kick's Damage Base is equal to twice the target's Weight Class.";
		damageBase = 0;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target, Weight Class";
		type = "Fighting";
		category = "Physical";
	}
	public Low_Kick(){}
}