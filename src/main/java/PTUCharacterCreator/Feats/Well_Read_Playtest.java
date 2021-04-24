package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Well_Read_Playtest extends Feature {
	{
		name = "Well Read [Playtest]";
		tags = "[General Research Field] [Branch] [5-15 Playtest]";
		frequency = "Static";
		effect = "You may use your General Education Rank to qualify for Books, instead of the Books usual Skill Prerequisites, provided you have the normal Prerequisite at at least Novice Rank.";
		prereqs.put("Bookworm", 0);
		prereqs.put("Gen Edu", 5);
	}
	public Well_Read_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",5);
	}
}