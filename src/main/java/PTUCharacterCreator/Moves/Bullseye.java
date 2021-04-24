package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bullseye extends Move {
	{
		name = "Bullseye";
		effect = "Bullseye is a Critical Hit on 16+. Limitation: Ranged Weapons Only";
		damageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "WR, 1 Target";
		type = "Weapon";
		category = "Physical";
	}
	public Bullseye(){}
}