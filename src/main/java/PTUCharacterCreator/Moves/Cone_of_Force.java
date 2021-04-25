package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Cone_of_Force extends Move {
	{
		name = "Cone of Force";
		effect = "Cone of Force Pushes all targets 2 meters, and lowers their Evasion by -2 for 1 full round.. Limitation: Melee Weapons Only";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "Scene x2";
		range = "Cone 2, Push";
		type = "Weapon";
		category = "Special";
	}
	public Cone_of_Force(){}
}