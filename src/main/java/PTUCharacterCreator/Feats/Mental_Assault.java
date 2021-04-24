package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Mental_Assault extends Feature {
	{
		name = "Mental Assault";
		tags = "[+Special Defense]";
		frequency = "Static";
		effect = "You learn the Moves Extrasensory and Psyshock.";
		prereqs.put("Telepath", -1);
		prereqs.put("Focus", 5);
		prereqs.put("Intuition", 5);
	}
	public Mental_Assault(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Telepath") && t.checkSkillRank("Focus",5) && t.checkSkillRank("Intuition",5);
	}
}