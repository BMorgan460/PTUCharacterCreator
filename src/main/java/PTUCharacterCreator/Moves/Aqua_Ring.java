package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Aqua_Ring extends Move {
	{
		name = "Aqua Ring";
		effect = "Aqua Ring covers the user in a Coat that heals the user at the beginning of their turn. The user is healed a Tick of Hit Points each turn.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Coat";
		type = "Water";
		category = "Status";
	}
	public Aqua_Ring(){}
}