package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Flip_Out extends Feature {
	{
		name = "Flip Out";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "Your Tumbler Moves gain additional effects. »» Aerial Ace: If you choose not to test for a Critical Hit, Aerial Ace gains the Pass Keyword. »» Splash: Once a Scene, you may use Splash as if it had the Interrupt keyword upon getting hit with an attack. If you do, you gain Damage Reduction against that attack equal to twice your Acrobatics Rank. »» Acrobatics: You may activate Acrobaticss extra damage even while holding an Item. »» Bounce: When you use Bounce, you dont trigger Hazards that turn and may choose to destroy all Hazards in your landing square and adjacent squares.";
		prereqs.put("Aerialist", -1);
		prereqs.put("Acrobatics", 4);
	}
	public Flip_Out(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Aerialist") && t.checkSkillRank("Acrobatics",4);
	}
}