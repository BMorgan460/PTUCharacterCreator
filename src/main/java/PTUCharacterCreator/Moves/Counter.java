package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Counter extends Move{
		{
		name = "Counter";
		type = "Fighting";
		frequency = "Scene";
		AC = 0;
		category = "Physical";
		range = "Melee, 1 Target, Reaction, Trigger";
		effect = "Counter may be used as a Reaction when the user is hit by a damaging Physical Attack Resolve the Triggering Attack, with Counter’s user resisting the attack one step further After the attack is resolved, if Counter’s user was not Fainted, the triggering foe then loses Hit Points equal to twice the amount of Hit Points lost by the user from the triggering attack Note that Counter is Physical, and while it cannot miss, it cannot hit targets immune to Fighting-Type Moves";
		}
                public Counter(){}
}