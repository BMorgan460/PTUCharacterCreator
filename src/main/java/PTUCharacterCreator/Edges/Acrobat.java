package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Acrobat extends Edge {
	{
		name = "Acrobat";
		effect = "Increase your Jump and Long Jump Capabilities by +1 each.";
		prereqs.put("Acrobatics", 3);
	}
	public Acrobat(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",3) && true;
	}
}