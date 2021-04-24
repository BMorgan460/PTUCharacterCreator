package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Breadth_of_Knowledge extends Feature {
	{
		name = "Breadth of Knowledge";
		tags = "[General Research Field] [Branch]";
		frequency = "Static";
		effect = "You gain three Skill Edges for which you qualify. These Edges must be used to gain a Skill Edge with an Education Skill, or to gain an Edge that has an Education Skill as a Prerequisite that you meet.";
		prereqs.put("Gen Edu", 3);
	}
	public Breadth_of_Knowledge(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",3);
	}
}