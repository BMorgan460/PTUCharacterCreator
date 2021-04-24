package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Upgrader extends Feature {
	{
		name = "Upgrader";
		tags = "[Upgrader Research Field]";
		frequency = "At-Will - Extended Action";
		effect = "You may craft any Augmentation Recipe for which you qualify and install them on yourself and willing Pokemon and Trainers. Recipes - Datajack, Eye Augments";
		prereqs.put("Med Edu", 3);
		prereqs.put("Tech Edu", 3);
	}
	public Upgrader(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Med Edu",3) && t.checkSkillRank("Tech Edu",3);
	}
}