package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Secret_Force extends Move {
	{
		name = "Secret Force";
		effect = "When calculating damage, the target subtracts their Defense from Secret Force’s damage instead of their Special Defense. Secret Force is still otherwise Special. Limitation: Melee Weapons Only";
		damageBase = 4;
		mDamageBase = 4;
		AC = 4;
		frequency = "EOT";
		range = "Melee, 1 Target, Smite";
		type = "Weapon";
		category = "Special";
	}
	public Secret_Force(){}
}