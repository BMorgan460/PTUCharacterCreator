package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Shore_Up extends Move {
	{
		name = "Shore Up";
		effect = "The user regains Hit Points equal to half of its max Hit Points. If used while in a Sandstorm, Shore Up instead fully recovers the users Hit Points.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Self";
		type = "Ground";
		category = "Status";
	}
	public Shore_Up(){}
}