package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sacred_Fire extends Move {
	{
		name = "Sacred Fire";
		effect = "Sacred Fire Burns the target on Even-Numbered Rolls.";
		damageBase = 10;
		mDamageBase = 10;
		AC = 3;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Fire";
		category = "Physical";
	}
	public Sacred_Fire(){}
}