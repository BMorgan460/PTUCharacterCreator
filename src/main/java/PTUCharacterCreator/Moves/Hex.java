package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Hex extends Move {
	{
		name = "Hex";
		effect = "Once a Scene, if Hex's target has a Status Affliction, you may have Hex's Damage Base be 13 instead (4d10+10 / 35)";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Ghost";
		category = "Special";
	}
	public Hex(){}
}