package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Effect_Spore extends Ability {
	{
		name = "Effect Spore";
		freq = "Scene -  Free Action";
		effect = "Trigger: The user is hit by a Melee Attack\nEffect: Roll 1d6. On a result of 1 or 2, the attacker is Poisoned. On a result of 3 or 4, the attacker is Paralyzed. On a result of 5 or 6, the attacker falls asleep.";
	}
	public Effect_Spore(){}
}