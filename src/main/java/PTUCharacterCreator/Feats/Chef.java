package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Chef extends Feature {
	{
		name = "Chef";
		tags = "[Class]";
		frequency = "At-Will - Extended Action";
		effect = "You may use any Chef Recipe for which you qualify. Recipes - Meal Planner, Salty Surprise, Spicy Wrap, Sour Candy, Dry Wafer, Bitter Treat, Sweet Confection";
		prereqs.put("Basic Cooking", -3);
		prereqs.put("Intuition", 3);
	}
	public Chef(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Basic Cooking") && t.checkSkillRank("Intuition",3);
	}
}