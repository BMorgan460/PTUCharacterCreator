package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Psybeam extends Move {
	{
		name = "Psybeam";
		effect = "Psybeam Confuses the target on 19+.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "At-Will";
		range = "6, 1 Target";
		type = "Psychic";
		category = "Special";
	}
	public Psybeam(){}
}