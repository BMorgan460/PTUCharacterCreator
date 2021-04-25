package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Grass_Knot extends Move {
	{
		name = "Grass Knot";
		effect = "Grass Knot's Damage Base is equal to twice the target's Weight Class.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "EOT";
		range = "5, 1 Target, Weight Class";
		type = "Grass";
		category = "Special";
	}
	public Grass_Knot(){}
}