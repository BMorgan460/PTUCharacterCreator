package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Cheap_Shot extends Move {
	{
		name = "Cheap Shot";
		effect = "Cheap Shot cannot miss. Limitation: Small Melee and Short Ranged Weapons Only";
		damageBase = 5;
		mDamageBase = 5;
		AC = 2;
		frequency = "EOT";
		range = "WR, 1 Target";
		type = "Weapon";
		category = "Physical";
	}
	public Cheap_Shot(){}
}