package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Stamina extends Edge {
	{
		name = "Stamina";
		effect = "Whenever you Take a Breather or take Massive Damage or a Critical Hit, you gain Temporary Hit Points equal to your Athletics or Combat Rank after the triggering action has resolved.";
		prereqs.put("Athletics or Combat", 5);
	}
	public Stamina(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",5) || t.checkSkillRank("Combat",5);
	}
}