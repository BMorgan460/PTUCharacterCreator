package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Façade extends Move {
	{
		name = "Façade";
		effect = "If the user is afflicted with a Persistent Status Affliction, Façade’s Damage Base is doubled to DB 14 (4d10+15 / 40).";
		damageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Façade(){}
}