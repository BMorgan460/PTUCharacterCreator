package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Defense_Mastery extends Feature {
	{
		name = "Defense Mastery";
		tags = "[Branch]";
		frequency = "Static";
		effect = "Whenever your Pokemon do not spend their Shift Action to Shift during a turn, they gain +5 Damage Reduction for one full round.";
		prereqs.put("Stat Maneuver", -1);
	}
	public Defense_Mastery(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Defense Maneuver");
	}
}