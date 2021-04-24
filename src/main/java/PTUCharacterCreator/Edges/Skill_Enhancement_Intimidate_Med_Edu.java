package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Skill_Enhancement_Intimidate_Med_Edu extends Edge {
	{
		name = "Skill Enhancement Intimidate, Med Edu";
		effect = "Choose two different Skills. You gain a +2 bonus to each of those skills. Skill Enhancement may be taken multiple times, but the bonus may be applied only once to a particular skill.";
		prereqs.put("-", 0);
	}
	public Skill_Enhancement_Intimidate_Med_Edu(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}