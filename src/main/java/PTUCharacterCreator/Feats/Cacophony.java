package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Cacophony extends Feature {
	{
		name = "Cacophony";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You learn the Moves Screech and Metal Sound.";
		prereqs.put("Mt. Moon Blues", -1);
		prereqs.put("Charm", 4);
		prereqs.put("Focus", 4);
	}
	public Cacophony(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Mt. Moon Blues") && t.checkSkillRank("Charm",4) && t.checkSkillRank("Focus",4);
	}
}