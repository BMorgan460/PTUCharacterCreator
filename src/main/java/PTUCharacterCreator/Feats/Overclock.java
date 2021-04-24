package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Overclock extends Feature {
	{
		name = "Overclock";
		tags = "[Engineer Researcher Field]";
		frequency = "Scene - Swift Action";
		effect = "Target: Your Pokebot Effect: The target is cured of all Persistent Statuses, resets all negative Combat Stages to default, and gains two Ticks of Temporary Hit Points. For the rest of the Scene, it deals and takes additional damage with all attacks equal to your Technology Education Rank. Recipe - Kitbash King";
		prereqs.put("Engineer", -1);
		prereqs.put("Tech Edu", 5);
	}
	public Overclock(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Engineer") && t.checkSkillRank("Tech Edu",5);
	}
}