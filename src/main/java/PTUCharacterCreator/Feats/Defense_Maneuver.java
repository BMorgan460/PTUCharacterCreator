package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Defense_Maneuver extends Feature {
	{
		name = "Defense Maneuver";
		tags = "[Branch]";
		frequency = "Scene - Free Action";
		effect = "You may activate this feature whenever your Pokemon is hit by a Physical Attack to receive the blow as if your Pokemons Defense Combat Stages were at +6 instead of their current value.";
		prereqs.put("Stat Ace", -1);
		prereqs.put("Command", 4);
		prereqs.put("Focus", 4);
	}
	public Defense_Maneuver(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Defense Ace") && t.checkSkillRank("Command",4) && t.checkSkillRank("Focus",4);
	}
}