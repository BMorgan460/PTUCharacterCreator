package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Telepathic_Awareness extends Feature {
	{
		name = "Telepathic Awareness";
		tags = "[+Special Defense]";
		frequency = "Static";
		effect = "Choose Gentle Vibe or Telepathy. You gain the chosen Ability.";
		prereqs.put("Telepath", -1);
	}
	public Telepathic_Awareness(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Telepath");
	}
}