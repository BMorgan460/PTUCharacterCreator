package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Telepathic_Warning extends Feature {
	{
		name = "Telepathic Warning";
		tags = "[+Special Defense]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You or an Ally use an Attack  Effect: Youre able to give your allies heed of attacks. All allies that would be hit by the attack may take a Shift Action as an Interrupt to move out of the area of effect of the attack. Using this leaves discoverable Psychic Residue on each affected ally. You may only use Telepathic Warning as long as you have the Telepath Capability.";
		prereqs.put("Telepathic Awareness", -1);
		prereqs.put("Focus", 5);
		prereqs.put("Intuition", 5);
	}
	public Telepathic_Warning(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Telepathic Awareness") && t.checkSkillRank("Focus",5) && t.checkSkillRank("Intuition",5);
	}
}