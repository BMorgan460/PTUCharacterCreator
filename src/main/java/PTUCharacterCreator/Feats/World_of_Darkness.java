package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class World_of_Darkness extends Feature {
	{
		name = "World of Darkness";
		tags = "[+Attack or Special Attack]";
		frequency = "2 AP - Standard Action";
		effect = "You create a zone of Shifting Darkness in a Burst 2 around you, which persists until the end of the encounter. All targets without Darkvision attacking from or i nto the Shifting Darkness receive a -3 penalty to Accuracy. You may count Shifting Darkness as complete darkness for the purposes of activating your Living Shadow. As a Static effect, you also gain the Darkvision Capability.";
		prereqs.put("Shade Caller", -1);
		prereqs.put("Guile", 4);
		prereqs.put("Stealth", 4);
	}
	public World_of_Darkness(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Shade Caller") && t.checkSkillRank("Guile",4) && t.checkSkillRank("Stealth",4);
	}
}