package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Thrust extends Ability {
	{
		name = "Thrust";
		freq = "Static";
		effect = "Trigger: \nEffect: All moves used by this Pokémon which consult the Attack stat now have the Push keyword. The default push for moves is 1 meter. If a move already has the Push Keyword, that move may push 1 additional meter.";
	}
	public Thrust(){}
}