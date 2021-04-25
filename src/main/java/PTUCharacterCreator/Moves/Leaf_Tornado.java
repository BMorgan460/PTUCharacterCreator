package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Leaf_Tornado extends Move {
	{
		name = "Leaf Tornado";
		effect = "Small or Medium targets in the central square of the blast are not hit. On 15+, all legal targets have their Accuracy lowered by -1.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 4;
		frequency = "EOT";
		range = "6, Ranged Blast 3";
		type = "Grass";
		category = "Special";
	}
	public Leaf_Tornado(){}
}