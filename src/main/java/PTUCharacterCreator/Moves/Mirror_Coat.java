package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mirror_Coat extends Move {
	{
		name = "Mirror Coat";
		effect = "Mirror Coat may be used as a Reaction when the user is hit by a damaging Special Attack. Resolve the Triggering Attack, with Mirror Coat’s user resisting the attack one step further. After the attack is resolved, if Mirror Coat’s user was not Fainted, the triggering foe then loses Hit Points equal to twice the amount of Hit Points lost by the user from the triggering attack. Note that Mirror Coat is Special, and while it cannot miss, it cannot hit targets immune to Psychic-Type Moves.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Any, 1 Target, Reaction";
		type = "Psychic";
		category = "Status";
	}
	public Mirror_Coat(){}
}