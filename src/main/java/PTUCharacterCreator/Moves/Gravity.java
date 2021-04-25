package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Gravity extends Move {
	{
		name = "Gravity";
		effect = "For 5 rounds, the area is considered Warped. While Warped, Moves that involve the user being airborne may not be used. Pokemon cannot use Sky or Levitate Capabilities to end their turn at an altitude higher than 1 meter. Flying-Types and Pokemon with the Ability Levitate are no longer immune to Ground-Type Moves. All Accuracy Rolls receive a +2 Bonus.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field";
		type = "Psychic";
		category = "Status";
	}
	public Gravity(){}
}