package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Facade extends Move {
	{
		name = "Facade";
		effect = "If the user is afflicted with a Persistent Status Affliction, Facade's Damage Base is doubled to DB 14 (4d10+15 / 40).";
		damageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Facade(){}
}