package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Beast_Master extends Edge {
	{
		name = "Beast Master";
		effect = "You may use Intimidate instead of Command to make Pokemon at 0 or 1 Loyalty obey your commands.  You may also use Intimidate instead of Command to determine the limits and Bonus Experience from Training.";
		prereqs.put("Intimidate", 3);
	}
	public Beast_Master(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intimidate",3) && true;
	}
}