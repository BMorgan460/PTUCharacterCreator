package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Simple_Beam extends Move {
	{
		name = "Simple Beam";
		effect = "You choose one of the target's Abilities. Simple Beam changes that Ability to Simple for the remainder of the encounter.";
		damageBase = 0;
		AC = 2;
		frequency = "Scene";
		range = "6, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Simple_Beam(){}
}