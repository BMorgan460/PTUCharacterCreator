package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Traveler extends Edge {
	{
		name = "Traveler";
		effect = "You may use Survival instead of Athletics and Acrobatics to determine your Power Capability, High Jump, and Long Jump values. Determine your Overland Movement by substituting your Survival Rank for the lower of your Athletics or Acrobatics Rank.";
		prereqs.put("Survival", 3);
	}
	public Traveler(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Survival",3) && true;
	}
}