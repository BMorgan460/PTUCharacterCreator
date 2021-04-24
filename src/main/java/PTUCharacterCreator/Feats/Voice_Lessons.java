package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Voice_Lessons extends Feature {
	{
		name = "Voice Lessons";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You and your Pokemons Moves with the Sonic keyword gain the Friendly keyword. Voice Lessons may not affect the Move Perish Song. Additionally, whenever your Pokemon use a Move with the Sonic Keyword in a Contest, they may roll +1d6.";
		prereqs.put("Noise Complaint", -1);
	}
	public Voice_Lessons(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Noise Complaint");
	}
}