package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Wallrunner extends Edge {
	{
		name = "Wallrunner";
		effect = "You may run on vertical surfaces both vertically and horizontally for up to your Acrobatics Rank in meters before jumping off.";
		prereqs.put("Acrobatics", 5);
	}
	public Wallrunner(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",5) && true;
	}
}