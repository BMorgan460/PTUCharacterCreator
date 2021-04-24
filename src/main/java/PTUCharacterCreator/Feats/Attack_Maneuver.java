package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Attack_Maneuver extends Feature {
	{
		name = "Attack Maneuver";
		tags = "[Branch]";
		frequency = "Scene - Free Action";
		effect = "You may activate this Feature to cause one of your Pokemon to use a Physical “Melee, 1-Target” Move as if its range was “Melee, Pass” or “Melee, 3-Targets” instead.";
		prereqs.put("Attack Ace", -1);
		prereqs.put("Command", 4);
		prereqs.put("Focus", 4);
	}
	public Attack_Maneuver(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Attack Ace") && t.checkSkillRank("Command",4) && t.checkSkillRank("Focus",4);
	}
}