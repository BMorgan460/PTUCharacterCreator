package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Sneaks_Tricks extends Edge {
	{
		name = "Sneak's Tricks";
		effect = "You learn the move Astonish.";
		prereqs.put("Stealth", 4);
	}
	public Sneaks_Tricks(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Stealth",4) && true;
	}
}