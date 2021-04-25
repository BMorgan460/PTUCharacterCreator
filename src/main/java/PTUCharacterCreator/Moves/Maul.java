package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Maul extends Move {
	{
		name = "Maul";
		effect = "The target is Flinched. Limitation: Melee Weapons Only";
		damageBase = 5;
		mDamageBase = 5;
		AC = 2;
		frequency = "Scene x2";
		range = "1 Target, Melee";
		type = "Weapon";
		category = "Physical";
	}
	public Maul(){}
}