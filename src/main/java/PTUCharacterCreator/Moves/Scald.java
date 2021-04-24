package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Scald extends Move {
	{
		name = "Scald";
		effect = "Scald Burns the target on 15+.";
		damageBase = 8;
		AC = 2;
		frequency = "Scene x2";
		range = "5, 1 Target";
		type = "Water";
		category = "Special";
	}
	public Scald(){}
}