package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Experimental_AI extends Feature {
	{
		name = "Experimental AI";
		tags = "[Engineer Researcher Field]";
		frequency = "Static";
		effect = "Increase the maximum complexity of all Pokebots you create by 2, and increase the maximum complexity of Pokebots you can control by 2. Recipe - Futuretech";
		prereqs.put("Engineer", -1);
		prereqs.put("Tech Edu", 6);
	}
	public Experimental_AI(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Engineer") && t.checkSkillRank("Tech Edu",6);
	}
}