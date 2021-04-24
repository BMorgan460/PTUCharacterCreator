package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Throwing_Masteries extends Edge {
	{
		name = "Throwing Masteries";
		effect = "Increase the Throwing Range of your Poke Balls, Ranged Weapons, and other small items by +2.";
		prereqs.put("Acrobatics", 4);
	}
	public Throwing_Masteries(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",4) && true;
	}
}