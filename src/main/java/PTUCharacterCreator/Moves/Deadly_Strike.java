package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Deadly_Strike extends Move {
	{
		name = "Deadly Strike";
		effect = "If Deadly Strike Hits, it is a Critical Hit. Limitation: Not usable by Large Melee Weapons.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "Scene x2";
		range = "WR, 1 Target";
		type = "Weapon";
		category = "Physical";
	}
	public Deadly_Strike(){}
}