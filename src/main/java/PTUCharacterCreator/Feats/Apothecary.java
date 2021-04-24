package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Apothecary extends Feature {
	{
		name = "Apothecary";
		tags = "[Apothecary Research Field] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "You may use any Apothecary Recipe for which you qualify. Recipe - Restorative Science";
		prereqs.put("Med Edu", 3);
	}
	public Apothecary(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Med Edu",3);
	}
}