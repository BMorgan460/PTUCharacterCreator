package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Special_Defense_Mastery extends Feature {
	{
		name = "Special Defense Mastery";
		tags = "[Branch]";
		frequency = "Static";
		effect = "Whenever your Pokemon would lose a Tick of Hit Points from Status Afflictions, Weather, or other effects, they lose 5 fewer Hit Points, to a minimum of 1.";
		prereqs.put("Stat Maneuver", -1);
	}
	public Special_Defense_Mastery(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Special Defense Maneuver");
	}
}