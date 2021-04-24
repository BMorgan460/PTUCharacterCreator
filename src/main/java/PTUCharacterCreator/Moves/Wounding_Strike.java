package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Wounding_Strike extends Move {
	{
		name = "Wounding Strike";
		effect = "The target loses a Tick of Hit Points.";
		damageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "WR, 1 Target";
		type = "Weapon";
		category = "Physical";
	}
	public Wounding_Strike(){}
}