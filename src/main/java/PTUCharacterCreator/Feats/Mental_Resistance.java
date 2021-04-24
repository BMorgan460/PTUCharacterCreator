package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Mental_Resistance extends Feature {
	{
		name = "Mental Resistance";
		tags = "[Occultism Research Field] [Branch]";
		frequency = "Static";
		effect = "You gain the Mindlock Capability and 10 Damage Reduction against Special Psychic, Ghost, and Dark-Type damage.";
		prereqs.put("Witch Hunter", -1);
	}
	public Mental_Resistance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Witch Hunter");
	}
}