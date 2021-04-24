package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Apricorn_Balls extends Edge {
	{
		name = "Apricorn Balls";
		effect = "As an Extended Action, you may craft Apricorns into their corresponding Poke Ball. Use of this Feature requires access to a Poke Ball Tool Box.";
		prereqs.put("Adept Tech Edu or Novice Survival", 0);
	}
	public Apricorn_Balls(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Tech Edu",4) && t.checkSkillRank("Survival",3);
	}
}