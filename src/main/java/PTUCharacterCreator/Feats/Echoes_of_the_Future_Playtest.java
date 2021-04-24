package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Echoes_of_the_Future_Playtest extends Feature {
	{
		name = "Echoes of the Future [Playtest]";
		tags = "[General Research Field] [Branch] [5-15 Playtest]";
		frequency = "Daily x2 - Free Action";
		effect = "Trigger: You or your Pokemon make a roll Effect: You may roll twice and keep the best result.";
		prereqs.put("Breadth of Knowledge", -1);
		prereqs.put("Gen Edu", 6);
	}
	public Echoes_of_the_Future_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Breadth of Knowledge") && t.checkSkillRank("Gen Edu",6);
	}
}