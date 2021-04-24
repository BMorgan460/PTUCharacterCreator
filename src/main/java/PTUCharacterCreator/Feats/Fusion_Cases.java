package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fusion_Cases extends Feature {
	{
		name = "Fusion Cases";
		tags = "[Jailbreaker Research Field]";
		frequency = "At-Will - Extended Action";
		effect = "Ingredients: Two different types of Poke Ball Cases. Effect: You combine the two Poke Ball Cases into a single Fusion Case with both effects and types. Fusion Cases may not be used as Ingredients for this Feature. Recipe - Advanced Cases";
		prereqs.put("Jailbreaker", -1);
		prereqs.put("Tech Edu", 6);
	}
	public Fusion_Cases(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Jailbreaker") && t.checkSkillRank("Tech Edu",6);
	}
}