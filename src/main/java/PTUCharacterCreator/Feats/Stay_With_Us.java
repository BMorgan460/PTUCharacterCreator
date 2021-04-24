package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Stay_With_Us extends Feature {
	{
		name = "Stay With Us!";
		tags = "[9-15 Playtest]";
		frequency = "Daily x3 - Full Action, Reaction";
		effect = "Trigger: An Ally is hit by an attack Effect: You must be able to Shift to your target to use this Feature. If you can, you immediately do so, and may apply a Potion, Super Potion, Hyper Potion, Energy Powder, or Energy Root. Though damage, injuries, and all other effects of the triggering attack are finalized before this Feature is applied, do not determine if the target has been Fainted, Killed, or gained Injuries from Hit Point Markers until after the effects of the action chosen through use of this Feature has been resolved.";
		prereqs.put("Front Line Healer", -1);
		prereqs.put("Med Edu", 6);
	}
	public Stay_With_Us(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Front Line Healer") && t.checkSkillRank("Med Edu",6);
	}
}