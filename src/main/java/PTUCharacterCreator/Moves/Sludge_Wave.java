package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sludge_Wave extends Move {
	{
		name = "Sludge Wave";
		effect = "Sludge Wave Poisons all legal targets on 19+.";
		damageBase = 10;
		AC = 2;
		frequency = "Scene x2";
		range = "Burst 1 or Close Blast 2";
		type = "Poison";
		category = "Special";
	}
	public Sludge_Wave(){}
}