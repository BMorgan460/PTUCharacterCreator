package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dashing_Makeover extends Feature {
	{
		name = "Dashing Makeover";
		tags = "";
		frequency = "Bind 2 AP - Extended Action";
		effect = "Target: A Trainer or Pokemon Effect: When you activate Dashing Makeover, choose one Equipment or Held Item you can create. While this Feature is Bound, the target gains the effects of the chosen item, as long as they would normally be able to equip it (e.g.: Trainers cannot equip Incense Items).They do not need to take up an Equipment or Held Item slot to gain this benefit. A target may only be affected by one instance of Dashing Makeover at a time. Recipe - Practical Fashion";
		prereqs.put("Fashionista", -1);
	}
	public Dashing_Makeover(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fashionista");
	}
}