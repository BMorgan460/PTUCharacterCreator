package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Special_Attack_Mastery extends Feature {
	{
		name = "Special Attack Mastery";
		tags = "[Branch]";
		frequency = "Static";
		effect = "The Range of your Pokemons Special Non-Melee Moves is increased by +2. This does not affect the size of Area-Of-Effect moves (But does affect the range at which you can place Ranged Blasts).";
		prereqs.put("Stat Maneuver", -1);
	}
	public Special_Attack_Mastery(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Special Attack Maneuver");
	}
}