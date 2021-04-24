package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Caustic_Chemistry extends Feature {
	{
		name = "Caustic Chemistry";
		tags = "[Chemistry Research Field] [Branch]";
		frequency = "1 AP - Swift Action";
		effect = "Trigger: You hit with a Pester Ball or apply a Repel to a Pokemon Effect: Make a Technology Education Roll. All targets affected by this Features trigger lose Hit Points equal to your roll. This may only affect a target once per Scene. Recipe - Pester Balls: Shut Down";
		prereqs.put("Chemist", -1);
		prereqs.put("Tech Edu", 5);
	}
	public Caustic_Chemistry(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Chemist") && t.checkSkillRank("Tech Edu",5);
	}
}