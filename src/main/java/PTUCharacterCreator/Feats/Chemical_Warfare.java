package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Chemical_Warfare extends Feature {
	{
		name = "Chemical Warfare";
		tags = "[Chemistry Research Field] [Branch]";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: You throw a Pester Ball Effect: The Pester Ball creates a Blast 2, affecting all targets in the area. Recipes - Pester Ball: Pain";
		prereqs.put("Chemist", -1);
		prereqs.put("Tech Edu", 4);
	}
	public Chemical_Warfare(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Chemist") && t.checkSkillRank("Tech Edu",4);
	}
}