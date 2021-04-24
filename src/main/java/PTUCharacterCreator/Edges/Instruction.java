package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Instruction extends Edge {
	{
		name = "Instruction";
		effect = "Whenever you aid an ally in an Assisted Skill Check using an Education Skill you have at Novice Rank or higher, add your full Rank value as a bonus to their roll instead of half.";
		prereqs.put("Gen Edu", 3);
	}
	public Instruction(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",3) && true;
	}
}