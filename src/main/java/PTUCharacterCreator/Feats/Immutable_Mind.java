package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Immutable_Mind extends Feature {
	{
		name = "Immutable Mind";
		tags = "[Occultism Research Field] [Branch]";
		frequency = "Scene - Free Action";
		effect = "Trigger: Youre hit by a Psychic-, Ghost-, or Dark-Type Move Effect: If the triggering Move was a Status-Class Move, the Move fails. If the Triggering Move was a Damaging Move with a Secondary Effect that triggers on a certain roll, you are immune to the secondary effect.";
		prereqs.put("Mental Resistance", -1);
		prereqs.put("Ocu Edu", 5);
	}
	public Immutable_Mind(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Mental Resistance") && t.checkSkillRank("Ocu Edu",5);
	}
}