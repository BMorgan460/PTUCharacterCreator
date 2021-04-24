package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Lucent_Mirage extends Feature {
	{
		name = "Lucent Mirage";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You gain the Illusionist Capability.";
		prereqs.put("Prism", -1);
	}
	public Lucent_Mirage(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Prism");
	}
}