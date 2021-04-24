package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Top_Tier_Berries extends Feature {
	{
		name = "Top Tier Berries";
		tags = "[Botany Research Field] [Branch]";
		frequency = "Static";
		effect = "You may grow additional Berries and Herbs, depending on the higher of your General Education or Survival Rank. »» Novice: You may grow Tier 2 Berries »» Adept: You may grow Mental Herbs, Power Herbs, White Herbs, and Tiny Mushrooms. »» Expert: You may grow Revival Herbs, Energy Roots, Big Mushrooms, and Tier 3 Berries »» Master: Increase the Soil Quality of all your plants by +1.";
		prereqs.put("Green Thumb", -3);
	}
	public Top_Tier_Berries(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Green Thumb");
	}
}