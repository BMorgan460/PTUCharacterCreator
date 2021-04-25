package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Thrash extends Move {
	{
		name = "Thrash";
		effect = "After damage is dealt, the user becomes Enraged and Confused.";
		damageBase = 12;
		mDamageBase = 12;
		AC = 3;
		frequency = "Scene x2";
		range = "Melee, all adjacent foes, Smite";
		type = "Normal";
		category = "Physical";
	}
	public Thrash(){}
}