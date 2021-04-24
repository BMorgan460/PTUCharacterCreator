package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Researcher extends Feature {
	{
		name = "Researcher";
		tags = "[Class][Branch]";
		frequency = "Static";
		effect = "Choose two Researcher Fields of Study. You may take Features from those Fields with this instance of Researcher. Gain one Feature from a chosen Researcher Field for which you qualify. Note: Researcher is broken up into multiple Fields of Study. You may not take Features from a Field of Study you havent chosen with the base Researcher Feature. You may take Researcher any number of times, each time choosing two different Fields of Study.";
		prereqs.put("An Education Skill at Novice Rank", 0);
	}
	public Researcher(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",3) || t.checkSkillRank("Tech Edu",3) || t.checkSkillRank("Med Edu",3) || t.checkSkillRank("Poke Edu",3) || t.checkSkillRank("Ocu Edu",3);
	}
}