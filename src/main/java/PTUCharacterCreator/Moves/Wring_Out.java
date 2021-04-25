package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Wring_Out extends Move {
	{
		name = "Wring Out";
		effect = "For every 10% the target is below their full HP, Wring Out's Damage Base is reduced by -1.";
		damageBase = 12;
		mDamageBase = 12;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Special";
	}
	public Wring_Out(){}
}