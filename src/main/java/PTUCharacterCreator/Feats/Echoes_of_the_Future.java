package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Echoes_of_the_Future extends Feature {
	{
		name = "Echoes of the Future";
		tags = "[General Research Field] [Branch]";
		frequency = "Daily x2 - Free Action";
		effect = "Trigger: You or your Pokemon make a roll Effect: You may roll twice and keep the best result.";
		prereqs.put("Gen Edu", 6);
	}
	public Echoes_of_the_Future(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",6);
	}
}