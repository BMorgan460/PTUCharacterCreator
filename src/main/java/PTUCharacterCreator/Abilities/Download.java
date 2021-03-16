package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Download extends Ability {
	{
		name = "Download";
		freq = "Scene -  Free Action";
		effect = "Trigger: \nEffect: The target must reveal whether its Defense or Special Defense Stats are lower. If the Defense Stat is lower, the user gains a +5 Damage Bonus with Physical Moves when attacking the target. If the Special Defense Stat is lower, the Damage Bonus is instead to Special Moves.";
	}
	public Download(){}
}