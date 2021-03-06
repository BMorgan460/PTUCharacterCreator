package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Gravel_Before_Me extends Feature {
	{
		name = "Gravel Before Me";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Trigger: Your Rock-Type Pokemon misses all targets with a Rock-Type attack, receives an Injury, suffers a Critical Hit, or Faints. Effect: Create a Stealth Rock Hazard adjacent to your Pokemon.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Rock as Chosen Type", 0);
	}
	public Gravel_Before_Me(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}