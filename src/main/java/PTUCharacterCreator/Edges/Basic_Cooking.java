package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Basic_Cooking extends Edge {
	{
		name = "Basic Cooking";
		effect = "You may create Candy Bars or Baby Food with cooking ingredients costing $50. You may fluff the food in any reasonable manner you like.";
		prereqs.put("Intuition", 3);
	}
	public Basic_Cooking(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intuition",3) && true;
	}
}