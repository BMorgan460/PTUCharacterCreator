package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Scholar extends Edge {
	{
		name = "Scholar";
		effect = "You gain a +1 Bonus to Skill Checks with General Education, Medicine Education, Occult Education, Pokemon Education, Technology Education, and Survival.";
		prereqs.put("Gen Edu", 5);
	}
	public Scholar(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",5) && true;
	}
}