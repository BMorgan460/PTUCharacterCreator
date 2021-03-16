package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Merciless extends Ability {
	{
		name = "Merciless";
		freq = "Static";
		effect = "Trigger: \nEffect: When the user attacks a target that is Poisoned, increase the critical range of the attack by 3. If they are Badly Poisoned, the critical range is instead increased by 6.";
	}
	public Merciless(){}
}