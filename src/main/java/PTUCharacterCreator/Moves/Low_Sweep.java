package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Low_Sweep extends Move {
	{
		name = "Low Sweep";
		effect = "Lower the target’s Speed by -1 CS.";
		damageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public Low_Sweep(){}
}