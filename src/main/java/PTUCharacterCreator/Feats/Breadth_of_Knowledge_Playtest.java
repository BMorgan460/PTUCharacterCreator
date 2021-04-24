package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Breadth_of_Knowledge_Playtest extends Feature {
	{
		name = "Breadth of Knowledge [Playtest]";
		tags = "[General Research Field] [Branch] [5-15 Playtest]";
		frequency = "Static";
		effect = "You gain three Edges for which you qualify. These Edges must be used to gain a Skill Edge with an Education Skill, or to gain an Edge that has an Education Skill as a Prerequisite that you meet.";
		prereqs.put("Gen Edu", 3);
	}
	public Breadth_of_Knowledge_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",3);
	}
}