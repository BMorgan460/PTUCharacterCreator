package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class I_Am_Error extends Feature {
	{
		name = "I Am Error";
		tags = "[+Special Defense]";
		frequency = "2 AP - Free Action";
		effect = "Trigger: You gain a Status Affliction:   Roll 1d10 and change which Status Affliction is gained according to page 86 of the Do Porygon Dream of Mareep? splatbook. If the target already has that Status Affliction, roll again.";
		prereqs.put("Glitch Bender", -1);
	}
	public I_Am_Error(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Glitch Bender");
	}
}