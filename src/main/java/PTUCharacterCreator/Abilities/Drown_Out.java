package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Drown_Out extends Ability {
	{
		name = "Drown Out";
		freq = "Scene -  Free Action";
		effect = "Trigger: A foe uses a Move with the Sonic keyword\nEffect: The user makes a Focus Check with a DC equal to the Move's Accuracy Roll. If the user succeeds, the triggering Move fails.";
	}
	public Drown_Out(){}
}