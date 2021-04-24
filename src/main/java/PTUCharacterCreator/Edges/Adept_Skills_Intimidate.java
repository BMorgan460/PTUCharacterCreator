package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Adept_Skills_Intimidate extends Edge {
	{
		name = "Adept Skills Intimidate";
		effect = "You Rank Up a Skill from Novice to Adept. You may take this Edge multiple times.";
		prereqs.put("Level 2", -2);
		prereqs.put("Intimidate", 3);
	}
	public Adept_Skills_Intimidate(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(2) && t.checkSkillRank("Intimidate",3) && true;
	}
}