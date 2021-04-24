package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Virtuoso_Intimidate extends Edge {
	{
		name = "Virtuoso Intimidate";
		effect = "Choose a Skill at Master Rank. Consider that Skill to be effectively Rank 8 for any Features or effects that depend on Skill Rank. Virtuoso may be taken multiple times, but you must choose a different Skill each time.";
		prereqs.put("A skill at Master rank", 0);
		prereqs.put("Level 20", -2);
		prereqs.put("Intimidate", 6);
	}
	public Virtuoso_Intimidate(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(20) && t.checkSkillRank("Intimidate",6) && true;
	}
}