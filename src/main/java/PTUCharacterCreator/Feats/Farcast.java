package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Farcast extends Feature {
	{
		name = "Farcast";
		tags = "[+Speed]";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: You use the Move Teleport or activate the Teleporter Capability  Choose One Effect: You activate Teleporter as if your Teleporter value were three times its normal value or you may take one willing Pokemon or Trainer along with you as you teleport so long as you are touching them when you activate Farcast. You may expend two uses of Farcast at once to choose both effects.";
		prereqs.put("Space Distortion", -1);
		prereqs.put("Guile", 5);
	}
	public Farcast(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Space Distortion") && t.checkSkillRank("Guile",5);
	}
}