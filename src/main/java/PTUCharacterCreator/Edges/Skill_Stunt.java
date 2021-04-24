package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Skill_Stunt extends Edge {
	{
		name = "Skill Stunt";
		effect = "Choose a Skill you have at Novice Rank or higher. Choose a specific use of that Skill, when rolling that skill under those circumstances, you may choose to roll one less dice, and instead add +6 to the result. You may take this Edge multiple times, choosing a different circumstance each time.";
		prereqs.put("A skill at Novice rank or higher", 0);
	}
	public Skill_Stunt(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}