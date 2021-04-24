package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Gravity_Training extends Edge {
	{
		name = "Gravity Training";
		effect = "You gain the Gravitic Tolerance capability at a value of 1-3 or 2-4.";
		prereqs.put("Athletics or Focus", 3);
	}
	public Gravity_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",3) || t.checkSkillRank("Focus",3);
	}
}