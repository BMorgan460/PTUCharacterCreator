package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Efficient_Installation extends Feature {
	{
		name = "Efficient Installation";
		tags = "[Upgrader Research Field]";
		frequency = "Static";
		effect = "You and your Pokemon gain a +2 boost to their maximum Augmentation Capacity and count their used Capacity as 2 lower for the purposes of Augmentation Shock. You and your Pokemon can install multiple Augmentations in the same Slot. Recipe - Body Augments";
		prereqs.put("Upgrader", -1);
		prereqs.put("Tech Edu", 5);
	}
	public Efficient_Installation(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Upgrader") && t.checkSkillRank("Tech Edu",5);
	}
}