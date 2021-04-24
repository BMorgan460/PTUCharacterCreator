package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Battle_Synchronization extends Feature {
	{
		name = "Battle Synchronization";
		tags = "";
		frequency = "Scene x3 - Standard Action";
		effect = "For one full round, whenever a Channeled Pokemon successfully hits a foe, all Channeled Pokemon gain +1 Accuracy and +1 Evasion against that foe for the duration of this Feature.";
		prereqs.put("Channeler", -1);
	}
	public Battle_Synchronization(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Channeler");
	}
}