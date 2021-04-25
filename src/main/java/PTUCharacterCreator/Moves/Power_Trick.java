package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Power_Trick extends Move {
	{
		name = "Power Trick";
		effect = "The user's Attack stat and Defense stat are switched for the remainder of the encounter, or until the user is switched out or Fainted.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self";
		type = "Psychic";
		category = "Status";
	}
	public Power_Trick(){}
}