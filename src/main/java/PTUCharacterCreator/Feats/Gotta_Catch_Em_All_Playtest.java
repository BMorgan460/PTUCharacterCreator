package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Gotta_Catch_Em_All_Playtest extends Feature {
	{
		name = "Gotta Catch 'Em All [Playtest]";
		tags = "[+Speed] [9-15 Playtest]";
		frequency = "Static";
		effect = "Every time you Capture a Wild Pokemon that is a member of an evolutionary family of which you own no other Pokemon, you gain 1 Collector Stack. Whenever you make a Capture Roll, you may spend up to three Collector Stacks to gain an equal bonus to your Capture Roll, or you may spend three Collector Stacks to re-roll entirely.";
		prereqs.put("Advanced Capture Techniques Rank 3", -1);
	}
	public Gotta_Catch_Em_All_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Advanced Capture Techniques Rank 3");
	}
}