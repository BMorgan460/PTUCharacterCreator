package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Confusion extends Move {
	{
		name = "Confusion";
		effect = "Confusion Confuses the target on 19+.";
		damageBase = 5;
		mDamageBase = 5;
		AC = 2;
		frequency = "At-Will";
		range = "6, 1 Target";
		type = "Psychic";
		category = "Special";
	}
	public Confusion(){}
}