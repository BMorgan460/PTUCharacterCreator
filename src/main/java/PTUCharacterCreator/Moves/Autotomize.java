package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Autotomize extends Move {
	{
		name = "Autotomize";
		effect = "For the remainder of the Encounter, the user’s Weight Class is one value lower, to a minimum of 1. If the user can, the user’s Speed is raised by +2 Combat Stages.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Self";
		type = "Steel";
		category = "Status";
	}
	public Autotomize(){}
}