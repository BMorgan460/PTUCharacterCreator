package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Forewarn extends Ability {
	{
		name = "Forewarn";
		freq = "Scene -  Free Action";
		effect = "Trigger: \nEffect: The Move with the highest Damage Dice Roll known by the targeted foe is revealed. If there is a tie, all tied Moves are revealed. The Moves revealed gain a -2 Penalty during Accuracy Checks when used by the target for the rest of the encounter.";
	}
	public Forewarn(){}
}