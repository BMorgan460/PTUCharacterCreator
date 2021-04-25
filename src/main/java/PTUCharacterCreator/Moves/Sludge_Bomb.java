package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sludge_Bomb extends Move {
	{
		name = "Sludge Bomb";
		effect = "Sludge Bomb Poisons the target on 15+.";
		damageBase = 9;
		mDamageBase = 9;
		AC = 2;
		frequency = "EOT";
		range = "8, 1 Target";
		type = "Poison";
		category = "Special";
	}
	public Sludge_Bomb(){}
}