package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Captured_Momentum extends Feature {
	{
		name = "Captured Momentum";
		tags = "[+Speed]";
		frequency = "At-Will - Free Action";
		effect = "Trigger: You successfully Capture a Pokemon Choose One Effect: »You or your Pokemon gain a +2 bonus to their next Accuracy Roll during this combat. »You subtract your highest Skill Rank out of Acrobatics, Athletics, Stealth, Survival, Guile, or Perception from your next Capture Roll during this combat. »You gain 1 Temporary Action Point that disappears after one full round.";
		prereqs.put("Advanced Capture Techniques Rank 2", -1);
	}
	public Captured_Momentum(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Advanced Capture Techniques Rank 2");
	}
}