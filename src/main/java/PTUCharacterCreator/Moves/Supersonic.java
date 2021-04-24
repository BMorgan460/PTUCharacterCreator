package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Supersonic extends Move {
	{
		name = "Supersonic";
		effect = "The target becomes Confused. On miss, the target suffers a -2 penalty to Accuracy Rolls for one full round.";
		damageBase = 0;
		AC = 6;
		frequency = "Scene x2";
		range = "4, 1 Target, Sonic";
		type = "Normal";
		category = "Status";
	}
	public Supersonic(){}
}