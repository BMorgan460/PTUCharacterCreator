package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Resilience extends Feature {
	{
		name = "Resilience";
		tags = "";
		frequency = "2 AP - Free Action";
		effect = "Trigger: Your Pokemon is hit by a Critical Hit or gains a Status Affliction (or both) Effect: Your Pokemon does not gain a Status Affliction, and the triggering attack does damage as if it was not a Critical Hit. Resilience may only be used once per target per Scene.";
		prereqs.put("Awareness", -1);
		prereqs.put("Athletics", 5);
		prereqs.put("Focus", 5);
	}
	public Resilience(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Awareness") && t.checkSkillRank("Athletics",5) && t.checkSkillRank("Focus",5);
	}
}