package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Foresight extends Move {
	{
		name = "Foresight";
		effect = "Foresight may be activated as a Swift Action on the user’s turn. For the rest of the turn, the user’s Normal-Type and Fighting-Type Moves can hit and affect Ghost-Type targets, and the user can see through the Illusion Ability, Moves with the Illusion keyword, and effects created by the Illusionist Capability, ignoring all effects from those.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "Self, Swift Action";
		type = "Normal";
		category = "Status";
	}
	public Foresight(){}
}