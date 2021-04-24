package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Adept_Skills_Acrobatics extends Edge {
	{
		name = "Adept Skills Acrobatics";
		effect = "You Rank Up a Skill from Novice to Adept. You may take this Edge multiple times.";
		prereqs.put("Level 2", -2);
		prereqs.put("Acrobatics", 3);
	}
	public Adept_Skills_Acrobatics(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(2) && t.checkSkillRank("Acrobatics",3) && true;
	}
}