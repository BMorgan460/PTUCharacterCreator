package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Emergency_Reactivation extends Feature {
	{
		name = "Emergency Reactivation";
		tags = "[Upgrader Research Field]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You or your Pokemon suffer Augmentation Shock Effect: The triggering user does not suffer Augmentation Shock and their Augmentations are not disabled. This Feature may affect a target only once per Scene. Recipe - Limb Augments";
		prereqs.put("Upgrader", -1);
		prereqs.put("Tech Edu", 4);
	}
	public Emergency_Reactivation(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Upgrader") && t.checkSkillRank("Tech Edu",4);
	}
}