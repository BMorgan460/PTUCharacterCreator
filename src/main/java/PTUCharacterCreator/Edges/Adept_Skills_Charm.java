package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Adept_Skills_Charm extends Edge {
	{
		name = "Adept Skills Charm";
		effect = "You Rank Up a Skill from Novice to Adept. You may take this Edge multiple times.";
		prereqs.put("Level 2", -2);
		prereqs.put("Charm", 3);
	}
	public Adept_Skills_Charm(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(2) && t.checkSkillRank("Charm",3) && true;
	}
}