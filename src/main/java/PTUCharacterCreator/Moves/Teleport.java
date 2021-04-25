package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Teleport extends Move {
	{
		name = "Teleport";
		effect = "The user Teleports up to X meters, where X is its Teleporter Capability. Any Move that targeted Teleport's user continue through the desired target's space if the Move allows for it as if the user hadn't been there, single target moves simply miss. *Grants Teleporter 4";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Interrupt";
		type = "Psychic";
		category = "Status";
	}
	public Teleport(){}
}