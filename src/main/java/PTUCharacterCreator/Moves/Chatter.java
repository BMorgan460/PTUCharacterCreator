package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Chatter extends Move {
	{
		name = "Chatter";
		effect = "Chatter confuses all targets on 16+.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "At-Will";
		range = "4, 1 Target, Sonic";
		type = "Flying";
		category = "Special";
	}
	public Chatter(){}
}