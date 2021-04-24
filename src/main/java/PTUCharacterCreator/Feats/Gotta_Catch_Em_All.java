package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Gotta_Catch_Em_All extends Feature {
	{
		name = "Gotta Catch 'Em All";
		tags = "[+Speed]";
		frequency = "Daily x3 - Swift Action";
		effect = "Trigger: Your make a Capture Roll. Effect: You may switch the rolled digits on your 1d100 roll. For example, if you roll a 91, that can be switched to a 19. This does not turn a roll of 1 into a “Natural” roll of 100.";
		prereqs.put("Advanced Capture Techniques Rank 3", -1);
	}
	public Gotta_Catch_Em_All(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Advanced Capture Techniques Rank 3");
	}
}