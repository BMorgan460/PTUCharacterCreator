package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Utility_Drop extends Feature {
	{
		name = "Utility Drop";
		tags = "[+Speed]";
		frequency = "At-Will - Swift Action";
		effect = "Trigger: You Shift Effect: You may use a Smoke Ball, Caltrops, or Toxic Caltrops as a Free action during your Shift. Instead of the Moves usual area of effect, you leave one square of Smokescreen, Spikes, or Toxic Spikes on each square you leave as you Shift. Once you place 8 meters of Smoke, Spikes, or Toxic Spikes you may not place any more.";
		prereqs.put("Ninja's Arsenal", -1);
		prereqs.put("Stealth", 5);
	}
	public Utility_Drop(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ninja's Arsenal") && t.checkSkillRank("Stealth",5);
	}
}