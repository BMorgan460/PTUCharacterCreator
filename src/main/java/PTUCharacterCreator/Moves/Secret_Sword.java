package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Secret_Sword extends Move {
	{
		name = "Secret Sword";
		effect = "When calculating damage, the target subtracts their Defense from Secret Sword's damage instead of their Special Defense. Secret Sword is still otherwise Special (Special Evasion is used to avoid it, Mirror Coat can reflect it, etc.)";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Special";
	}
	public Secret_Sword(){}
}