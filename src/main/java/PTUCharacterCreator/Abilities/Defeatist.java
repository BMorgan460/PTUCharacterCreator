package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Defeatist extends Ability {
	{
		name = "Defeatist";
		freq = "Static";
		effect = "Trigger: \nEffect: Whenever the user is brought below 50% of their max Hit Points, the user's Attack and Special Attack are lowered by 1 Combat Stage each, and the user's Speed is increased by +2 Combat Stages. If the user is healed above 50% max Hit Points, these changes are reverted.";
	}
	public Defeatist(){}
}