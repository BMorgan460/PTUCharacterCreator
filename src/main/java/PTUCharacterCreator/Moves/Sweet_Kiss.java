package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sweet_Kiss extends Move {
	{
		name = "Sweet Kiss";
		effect = "The target is Confused. On miss, the target suffers a -2 penalty to Accuracy Rolls for one full round.";
		damageBase = 0;
		AC = 6;
		frequency = "Scene x2";
		range = "6, 1 Target, Social";
		type = "Fairy";
		category = "Status";
	}
	public Sweet_Kiss(){}
}