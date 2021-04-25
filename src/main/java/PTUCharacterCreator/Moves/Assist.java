package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Assist extends Move {
	{
		name = "Assist";
		effect = "Randomly select another Pokemon on the user’s roster and then randomly select a Move that Pokemon knows. Assist’s user uses that Move immediately.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Assist(){}
}