package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class My_KungFu_is_Stronger extends Feature {
	{
		name = "My Kung-Fu is Stronger";
		tags = "[Special]";
		frequency = "At-Will - Free Action";
		effect = "Trigger: A foe provokes an Attack of Opportunity Effect: You may use Rock Smash instead of an unarmed Struggle Attack. If you do, Rock Smashs Effect Range is increased by +2.";
		prereqs.put("Martial Training Rank 1", -1);
	}
	public My_KungFu_is_Stronger(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Martial Training Rank 1");
	}
}