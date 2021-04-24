package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Tornado_Charge extends Feature {
	{
		name = "Tornado Charge";
		tags = "";
		frequency = "Daily x3 - Special";
		effect = "Trigger: Your Pokemon gains Initiative Effect: Your Pokemon gains 2 additional Standard Actions this turn. Your Pokemon may also Shift between taking each action, so long as their total Movement does not exceed their Movement Capabilities. All three of your Pokemons Standard Actions this turn must be used to perform Zephyr Shield, or Flying-Type Moves with a Frequency of At-Will or EOT. Tornado Charge may be used only once per day per Pokemon.";
		prereqs.put("Celerity", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Tornado_Charge(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Celerity");
	}
}