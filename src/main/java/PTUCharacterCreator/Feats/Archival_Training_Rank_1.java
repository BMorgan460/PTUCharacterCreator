package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Archival_Training_Rank_1 extends Feature {
	{
		name = "Archival Training Rank 1";
		tags = "[Ranked 2]";
		frequency = "Static";
		effect = "You gain an Archive you have not previously obtained.";
		prereqs.put("Chronicler", -1);
	}
	public Archival_Training_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Chronicler");
	}
}