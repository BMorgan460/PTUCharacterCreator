package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fortress extends Feature {
	{
		name = "Fortress";
		tags = "[Class] [+Defense] [Weapon]";
		frequency = "At-Will - Free Action";
		effect = "Trigger: You target an enemy with a Struggle attack or Weapon Attack and end your turn adjacent to the target. Effect: You Mark all targets of the attack until the end of your next turn. Marked foes take a penalty to Attack Rolls against any targets besides you equal to your Focus Rank. A Mark from a different source (such as a second Fortress or a Fighting Type Aces Pokemon) will overwrite your Mark.";
		prereqs.put("Combat", 3);
		prereqs.put("Focus", 3);
	}
	public Fortress(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",3) && t.checkSkillRank("Focus",3);
	}
}