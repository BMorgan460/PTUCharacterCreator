package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Future_Sight extends Move {
	{
		name = "Future Sight";
		effect = "Future Sight does nothing on the turn it is used. At the end of the user's next turn, Future Sight hits, even if the user is no longer on the field. Future Sight cannot miss.";
		damageBase = 12;
		mDamageBase = 12;
		AC = 0;
		frequency = "Scene x2";
		range = "10, 1 Target";
		type = "Psychic";
		category = "Special";
	}
	public Future_Sight(){}
}