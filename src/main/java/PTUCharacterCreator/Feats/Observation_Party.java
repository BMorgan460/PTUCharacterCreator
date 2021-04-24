package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Observation_Party extends Feature {
	{
		name = "Observation Party";
		tags = "";
		frequency = "Static";
		effect = "While they are in a Location in your Travel Archive, your Pokemon have the Ability you chose when gaining Travel Archive and gain a +2 bonus to Perception Checks to notice the environment.";
		prereqs.put("Travel Album", 0);
		prereqs.put("Perception", 4);
	}
	public Observation_Party(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Perception",4);
	}
}