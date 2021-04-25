package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Entrainment extends Move {
	{
		name = "Entrainment";
		effect = "The target gains one of the user's Abilities for 3 turns.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene";
		range = "4, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Entrainment(){}
}