package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Transform extends Move {
	{
		name = "Transform";
		effect = "The user targets a Pokemon within 10 meters and assumes the form of the target. It gains all of the target's Moves, Abilities, and Capabilities, and copies its weight and height. Transform lasts until the user is switched out, Fainted, or until the end of the encounter. The user may choose to end the Transformation on its turn as a free action, regaining its previous Move List. The user's Stats do not change from using Transform. Transform cannot miss.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "At-Will";
		range = "10, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Transform(){}
}