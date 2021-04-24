package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Emergency_Release extends Feature {
	{
		name = "Emergency Release";
		tags = "[+Speed]";
		frequency = "2 AP - Shift Action";
		effect = "You may Release a Pokemon as an Interrupt.";
		prereqs.put("Juggler", -1);
		prereqs.put("Acrobatics", 5);
		prereqs.put("Guile", 5);
	}
	public Emergency_Release(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Juggler") && t.checkSkillRank("Acrobatics",5) && t.checkSkillRank("Guile",5);
	}
}