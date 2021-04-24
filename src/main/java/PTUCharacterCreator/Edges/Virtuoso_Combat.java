package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Virtuoso_Combat extends Edge {
	{
		name = "Virtuoso Combat";
		effect = "Choose a Skill at Master Rank. Consider that Skill to be effectively Rank 8 for any Features or effects that depend on Skill Rank. Virtuoso may be taken multiple times, but you must choose a different Skill each time.";
		prereqs.put("A skill at Master rank", 0);
		prereqs.put("Level 20", -2);
		prereqs.put("Combat", 6);
	}
	public Virtuoso_Combat(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(20) && t.checkSkillRank("Combat",6) && true;
	}
}