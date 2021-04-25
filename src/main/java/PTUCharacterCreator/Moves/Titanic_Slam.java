package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Titanic_Slam extends Move {
	{
		name = "Titanic Slam";
		effect = "On Even-Numbered Rolls, the target is Slowed for one full round. Limitation: Melee Weapons Only";
		damageBase = 11;
		mDamageBase = 11;
		AC = 3;
		frequency = "Scene x2";
		range = "1 Target, Melee";
		type = "Weapon";
		category = "Physical";
	}
	public Titanic_Slam(){}
}