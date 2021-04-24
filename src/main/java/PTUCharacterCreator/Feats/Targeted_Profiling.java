package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Targeted_Profiling extends Feature {
	{
		name = "Targeted Profiling";
		tags = "[Orders]";
		frequency = "2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: Until the end of your next turn, the target acts as if they had the Mold Breaker Ability against all Pokemon and Trainers in your Profile Archive and gains a +2 bonus to Accuracy Rolls against these targets.";
		prereqs.put("Profile Album", 0);
		prereqs.put("Perception", 5);
	}
	public Targeted_Profiling(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Perception",5);
	}
}