package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Virtuoso_Ocu_Ed extends Edge {
	{
		name = "Virtuoso Ocu Ed";
		effect = "Choose a Skill at Master Rank. Consider that Skill to be effectively Rank 8 for any Features or effects that depend on Skill Rank. Virtuoso may be taken multiple times, but you must choose a different Skill each time.";
		prereqs.put("A skill at Master rank", 0);
		prereqs.put("Level 20", -2);
		prereqs.put("Master Ocu Ed", 0);
	}
	public Virtuoso_Ocu_Ed(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(20) && true;
	}
}