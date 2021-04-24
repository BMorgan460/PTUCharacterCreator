package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Juggler extends Feature {
	{
		name = "Juggler";
		tags = "[Class] [+Speed]";
		frequency = "Static";
		effect = "Using Quick Switch costs only 1 AP. Whenever you send a Pokemon into an encounter from a Poke Ball, they receive a +10 bonus to their Initiative during that round.";
		prereqs.put("Quick Switch", -1);
		prereqs.put("Acrobatics", 3);
		prereqs.put("Guile", 3);
	}
	public Juggler(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Quick Switch") && t.checkSkillRank("Acrobatics",3) && t.checkSkillRank("Guile",3);
	}
}