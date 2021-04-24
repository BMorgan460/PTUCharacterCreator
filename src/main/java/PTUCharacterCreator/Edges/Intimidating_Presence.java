package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Intimidating_Presence extends Edge {
	{
		name = "Intimidating Presence";
		effect = "You learn the move Leer.";
		prereqs.put("Intimidate", 3);
	}
	public Intimidating_Presence(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intimidate",3) && true;
	}
}