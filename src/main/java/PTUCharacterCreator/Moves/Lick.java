package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Lick extends Move {
	{
		name = "Lick";
		effect = "Lick Paralyzes the target on 15+.";
		damageBase = 3;
		mDamageBase = 3;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Ghost";
		category = "Physical";
	}
	public Lick(){}
}