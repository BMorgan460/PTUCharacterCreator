package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Poison_Heal extends Ability {
	{
		name = "Poison Heal";
		freq = "Daily - Free Action";
		effect = "Trigger: The user becomes Poisoned.\nEffect: For the rest of the encounter, while Poisoned or Badly Poisoned, the user gains a Tick of Hit Points at the beginning of each turn instead of losing any Hit Points from Poison. At the end of the encounter, the user is cured of the Poison Status. Additionally, the user does not have any Combat Stages lowered from being Poisoned.";
	}
	public Poison_Heal(){}
}