package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Elite_Trainer extends Feature {
	{
		name = "Elite Trainer";
		tags = "";
		frequency = "Static";
		effect = "Choose Agility Training, Brutal Training, Focused Training, or Inspired Training. You gain the chosen Feature, even if you do not meet the prerequisites. When training, you may apply up to two different [Training] Features on each of your Pokemon. If you already have all of these Features, instead pick another Feature for which you qualify.";
		prereqs.put("Ace Trainer", -1);
	}
	public Elite_Trainer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ace Trainer");
	}
}