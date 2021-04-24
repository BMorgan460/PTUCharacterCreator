package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Egg_Tutor extends Feature {
	{
		name = "Egg Tutor";
		tags = "";
		frequency = "Daily - Extended Action";
		effect = "Target: A Pokemon with at least 2 Tutor Points. Effect: The target loses 2 Tutor Points, and learns any Move from its Egg Move List. A Pokemon may be targeted by Egg Tutor only one time.";
		prereqs.put("Move Tutor", -1);
	}
	public Egg_Tutor(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Move Tutor");
	}
}