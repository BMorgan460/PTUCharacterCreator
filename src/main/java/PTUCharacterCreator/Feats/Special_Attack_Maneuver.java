package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Special_Attack_Maneuver extends Feature {
	{
		name = "Special Attack Maneuver";
		tags = "[Branch]";
		frequency = "Scene - Free Action";
		effect = "You may activate this Feature to allow your Pokemon to use a Special Burst, Cone, Close Blast, Ranged Blast, or Line of any size as a Burst 1, Cone 2, Close Blast 2, or Line 4 instead.";
		prereqs.put("Stat Ace", -1);
		prereqs.put("Command", 4);
		prereqs.put("Focus", 4);
	}
	public Special_Attack_Maneuver(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Special Attack Ace") && t.checkSkillRank("Command",4) && t.checkSkillRank("Focus",4);
	}
}