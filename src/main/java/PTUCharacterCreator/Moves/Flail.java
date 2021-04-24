package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Flail extends Move {
	{
		name = "Flail";
		effect = "For each Injury the user has, Flail's Damage Base is increased by +1.";
		damageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Flail(){}
}