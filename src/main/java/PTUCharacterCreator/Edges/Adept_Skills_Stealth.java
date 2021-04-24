package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Adept_Skills_Stealth extends Edge {
	{
		name = "Adept Skills Stealth";
		effect = "You Rank Up a Skill from Novice to Adept. You may take this Edge multiple times.";
		prereqs.put("Level 2", -2);
		prereqs.put("Stealth", 3);
	}
	public Adept_Skills_Stealth(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(2) && t.checkSkillRank("Stealth",3) && true;
	}
}