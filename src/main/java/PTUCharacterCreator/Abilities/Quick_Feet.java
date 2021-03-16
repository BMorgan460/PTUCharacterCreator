package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Quick_Feet extends Ability {
	{
		name = "Quick Feet";
		freq = "Static";
		effect = "Trigger: \nEffect: When Poisoned, Burned, Paralyzed, Frozen or put to Sleep, the user's Speed is raised 2 Combat Stages. The user does not lose Speed Combat Stages from Paralysis. If the user is healed all Status Conditions, their Speed is lowered appropriately.";
	}
	public Quick_Feet(){}
}