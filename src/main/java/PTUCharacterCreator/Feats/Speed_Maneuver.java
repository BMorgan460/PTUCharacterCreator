package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Speed_Maneuver extends Feature {
	{
		name = "Speed Maneuver";
		tags = "[Branch]";
		frequency = "Scene - Free Action";
		effect = "You may activate this Feature at any time to cause your Pokemon to use a Move as Priority or a Priority Move as Priority (Advanced).";
		prereqs.put("Stat Ace", -1);
		prereqs.put("Command", 4);
		prereqs.put("Focus", 4);
	}
	public Speed_Maneuver(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Speed Ace") && t.checkSkillRank("Command",4) && t.checkSkillRank("Focus",4);
	}
}