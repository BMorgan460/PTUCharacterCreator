package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Download_Playtest extends Ability {
	{
		name = "Download [Playtest]";
		freq = "Scene - Swift Action";
		effect = "Trigger: \nEffect: The target must reveal whether its Defense or Special Defense Stats are lower. If the Defense Stat is lower, the user gains a +1 Attack CS. If the Special Defense Stat is lower, the user instead gains +1 Special Attack CS. If both are tied, the user gains +1 CS to any Stat of their choice.";
	}
	public Download_Playtest(){}
}