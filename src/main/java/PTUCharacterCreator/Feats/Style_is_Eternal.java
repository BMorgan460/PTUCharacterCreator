package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Style_is_Eternal extends Feature {
	{
		name = "Style is Eternal";
		tags = "";
		frequency = "1 AP - Free Action";
		effect = "Trigger: Your Pokemon is Disarmed or would have their Held Item removed by another effect such as Thief or Covet Effect: Your Pokemon instead retains their Held Item. Style is Eternal may only be used once per Scene per Pokemon. Recipe - Focused Fashion";
		prereqs.put("Fashionista", -1);
	}
	public Style_is_Eternal(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fashionista");
	}
}