package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Thought_Detection extends Feature {
	{
		name = "Thought Detection";
		tags = "[+Special Defense]";
		frequency = "Scene - Standard Action";
		effect = "You become aware of the number of living Humans or Pokemon within X meters of yourself, X is equal to your Focus Rank tripled. Pokemon or Trainers with the Mindlock Capability are not detected by this Ability. You may only use Thought Detection as long as you have the Telepathy Capability.";
		prereqs.put("Telepathic Awareness", -1);
	}
	public Thought_Detection(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Telepathic Awareness");
	}
}