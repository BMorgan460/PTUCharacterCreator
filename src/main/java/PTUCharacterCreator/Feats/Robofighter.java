package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Robofighter extends Feature {
	{
		name = "Robofighter";
		tags = "[Engineer Researcher Field]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "As long as this feature is Bound, you can command your Pokebot using a Standard Action rather than a Pokemon turn. Your Pokebots may still only act once a round. Recipe - Firmware Update";
		prereqs.put("Engineer", -1);
		prereqs.put("Tech Edu", 4);
	}
	public Robofighter(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Engineer") && t.checkSkillRank("Tech Edu",4);
	}
}