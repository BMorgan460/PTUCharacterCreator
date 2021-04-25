package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sleep_Talk extends Move {
	{
		name = "Sleep Talk";
		effect = "Select another of the user’s Moves at random, this turn, the user may Shift and use that Move despite being Asleep. Sleep Talk can be only be used by Sleeping targets.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Sleep_Talk(){}
}