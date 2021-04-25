package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Salvo extends Move {
	{
		name = "Salvo";
		effect = "Limitation: Ranged Weapons Only";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "WR, Blast 2";
		type = "Weapon";
		category = "Physical";
	}
	public Salvo(){}
}