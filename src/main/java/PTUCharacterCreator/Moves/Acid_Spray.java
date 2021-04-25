package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Acid_Spray extends Move {
	{
		name = "Acid Spray";
		effect = "Acid Spray lowers the target’s Special Defense by -2 CS.";
		damageBase = 4;
		mDamageBase = 4;
		AC = 2;
		frequency = "EOT";
		range = "4, 1 Target";
		type = "Poison";
		category = "Special";
	}
	public Acid_Spray(){}
}