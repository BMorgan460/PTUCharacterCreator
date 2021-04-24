package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Pierce extends Move {
	{
		name = "Pierce!";
		effect = "Pierce deals an additional +10 damage against targets with Damage Reduction.";
		damageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "WR, 1 Target";
		type = "Weapon";
		category = "Physical";
	}
	public Pierce(){}
}